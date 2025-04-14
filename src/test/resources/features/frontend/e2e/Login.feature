Feature: Login

    Feature para probar el login de SIIGO en el ambiente de pruebas

    Scenario: Cargar correcta del formulario Login
        Given Tester desea ingresar al login de SIIGO
        Then Tester verifica que haya cargado exitosamente el formulario de login

    Scenario: Login Correcto en SIIGO
        Given Tester desea ingresar al login de SIIGO
        When Tester ingresa las credenciales <usr> y <passwd>
        Then Tester verifica que haya ingresado exitosamente
    
    Examples:
        | usr | passwd |
        | "retoautomationsiigo@yopmail.com" | "T4b4ck0ff1c3P455w0rd658*" |

    Scenario: Login Incorrecto en SIIGO
        Given Tester desea ingresar al login de SIIGO
        When Tester ingresa las credenciales <usr> y <passwd>
        Then Tester verifica que no haya ingresado exitosamente
    
    Examples:
        | usr | passwd |
        | "retoautomationsiigo@yopmail.com" | "holaMundo123" |
        | "uncorreodeprueba@yopmail.com" | "T4b4ck0ff1c3P455w0rd658*" |
        | "uncorreodeprueba@yopmail.com" | "holaMundo123" |