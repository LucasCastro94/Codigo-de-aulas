using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Security;
using System.Web.UI;
using System.Web.UI.WebControls;

// Para criação da privatização da pasta admin houve mudanças na web.config

namespace Projeto4
{
    public partial class Login : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void Entrar_Click(object sender, EventArgs e)
        {
            if(NomeAcesso.Text.Trim() == "" || Senha.Text.Trim() =="")
            {
                Mensagem.Text = "Preencha todos os campos";
            }
            else
            {
                if(NomeAcesso.Text == "admin" && Senha.Text =="12345")
                {    

                    //cria uma variavel de controle para identificar e se o usuario esta ou não autenticado
                    Session["Autenticado"] = "Admin";

                    //1. inicializa a autenticação
                    System.Web.Security.FormsAuthentication.Initialize();

                    //2. criar o ticket de autenticação do usuario
                    FormsAuthenticationTicket ticket = new FormsAuthenticationTicket(1, "admin", DateTime.Now, DateTime.Now.AddMinutes(20), false, FormsAuthentication.FormsCookieName);

                    //3. Criptografia o ticket e registra no  arquivo (Cookie) No Navgeador
                    Response.Cookies.Add(new HttpCookie(FormsAuthentication.FormsCookieName, FormsAuthentication.Encrypt(ticket)));

                    //4. Redireciona para o Url que esta tentando entra
                    Response.Redirect(FormsAuthentication.GetRedirectUrl("admin", false));

                }
                else
                {
                    Mensagem.Text = "Dados de acesso invalidos";
                }
            }
        }
    }
}