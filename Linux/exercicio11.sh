#!/bin/bash
x=1
groupadd  Storage
groupadd users

while [ $x -le 10 ]
do
if(( $x <6 ))
then
useradd -m -g users -G audio,video -m -d /etc/temp_skel/user$x user$x
echo -e "admin1234\nadmin1234" | (passwd user$x)
passwd --expire user$x
chage -E 10/10/2022 user$x #usuarios temporarios expiram em 10/10/22 desativa conta
chage -W 15 user$x
passwd -x 60 user$x
chage -I 30 user$x #conta é desativada apos 30 dias de senha expirada
else
useradd -G audio,video,Storage,scanner,users -m -d /etc/skel/user$x user$x
echo -e "admin1234\nadmin1234" | (passwd user$x)
passwd --expire user$x
chage -E 10/10/2050 user$x 
passwd -x 60 user$x
chage -I 30 user$x 
fi
x=$(( $x + 1 ))
done

