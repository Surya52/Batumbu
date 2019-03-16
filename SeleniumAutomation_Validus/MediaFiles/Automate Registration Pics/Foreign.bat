set projectLocation= E:\FRAME WORK\SeleniumAutomation_Validus (2)\SeleniumAutomation_Validus\src
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\Indonesia\Pinjman_Investor_FOreignBusinessEntity.xml
pause