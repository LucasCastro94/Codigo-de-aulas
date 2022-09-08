using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace Projeto4
{
    public partial class Page : System.Web.UI.MasterPage
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            
            if (Session["Autenticado"] != null)
            {
                LinkExcecoes.Visible = true;
                LinkUsuarios.Visible = true;
                LinkLogin.Visible = false;
                LinkLogout.Visible = true;

            }
            else
            {
                LinkExcecoes.Visible = false;
                LinkUsuarios.Visible = false;
                LinkLogin.Visible = true;
                LinkLogout.Visible = false;

            }
        }
      
    }
}