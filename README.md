OODP
===
To deploy the application using JAWS
Step 1: Install git using the command mentioned below  
Command:  sudo apt-get install git 
Step 2:Clone project from github
Command:   git clone https://github.com/GeethaSankineni/OODP.git
Step 3: Go to OODP/BlackJack directory 
Command:   cd ./cs445/BlackJack
Step 4: Add a new keystore named "testkeys" 
 Command: "keytool -genkey -keystore testKeys -alias jdc"
Step 5: Now attach newly generated keystore "testkeys" to your " BlackJackGame.jar " file.
Command: jarsigner -keystore testKeys BlackJackGame.jar. jdc
Step 6: Install Tomcat
Commands:                   sudo apt –get install tomcat7
                            sudo apt –get install tomcat7 –admin
                            sudo apt –get install tomcat7 –user
Step 7: Go to /var/lib/tomcat7/webapps/ROOT and copy .jnlp and jar file
Commands:  cp/path/blackjack.jnlp/var/lib/tomcat7/webapps/ROOT/
                       cp/path/ BlackJackGame.jar/var/lib/tomcat7/webapps/ROOT/
Step 8: Now run the tomcat by using file from its bin folder.
Command: sudo/etc/init.d/tomcat7 restart
Step 9: Install icedtea
Command: sudo apt -get  install icedtea -netx
Step 10:Run this url http://localhost:8080/blackjack.jnlp then it will ask for download  and will start the actual application.

To run the  application use the following steps:
Step 1: Install ant  
Command:  sudo apt-get install ant  
Step 2: To run the application 
Command:    ant build 
            ant BlackJackGame
Step 3: run unit test. 
Command:  ant test
Step 4: To generate a jar file
Command:     ant blackjack-jar



