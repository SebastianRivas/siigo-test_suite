Feature: ThirdParty

    Feature para probar la creacion de un tercero en SIIGO en el ambiente de pruebas

    Scenario: Cargar correcta del formulario Crear Tercero
        Given Tester desea ingresar al login de SIIGO
        When Tester ingresa las credenciales <usr> y <passwd>
        And Tester clikea el boton Crear 
        And Tester clikea la opcion Clientes
        Then Tester verifica que haya cargado correctamente el formulario de creacion
    
    Examples:
        | usr | passwd |
        | "retoautomationsiigo@yopmail.com" | "T4b4ck0ff1c3P455w0rd658*" |

    Scenario: Creacion valida de un Tercero
        Given Tester desea ingresar al login de SIIGO
        When Tester ingresa las credenciales <usr> y <passwd>
        And Tester clikea el boton Crear 
        And Tester clikea la opcion Clientes
        And Tester diligencia el formulario de creacion con los datos <args>
        Then Tester verifica que se haya creado correctamente el tercero
    
    Examples:
        | usr | passwd | args |
        | "retoautomationsiigo@yopmail.com" | "T4b4ck0ff1c3P455w0rd658*" | "{ \"tipo_persona\" : \"persona\", \"tipo_identificacion\" : null, \"numero_identificacion\" : \"199407281\", \"digito_verificacion\" : null, \"codigo_sucursal\" : null, \"nombres\" : \"Juan\", \"apellidos\" : \"Gomez\", \"nombre_comercial\" : null, \"ciudad\" : \"Cali\", \"direccion\" : null, \"indicativo\" : null, \"telefono\" : null, \"extension\" : null }" |

    Scenario: Creacion invalida de un Tercero
        Given Tester desea ingresar al login de SIIGO
        When Tester ingresa las credenciales <usr> y <passwd>
        And Tester clikea el boton Crear 
        And Tester clikea la opcion Clientes
        And Tester diligencia el formulario de creacion con los datos <args>
        Then Tester verifica que no se haya creado correctamente el tercero
    
    Examples:
        | usr | passwd | args |
        | "retoautomationsiigo@yopmail.com" | "T4b4ck0ff1c3P455w0rd658*" | "{ \"tipo_persona\" : \"persona\", \"tipo_identificacion\" : null, \"numero_identificacion\" : \"940728\", \"digito_verificacion\" : null, \"codigo_sucursal\" : null, \"nombres\" : \"Juan Gabriel\", \"apellidos\" : \"Murillo Gonzales\", \"nombre_comercial\" : null, \"ciudad\" : \"Cali\", \"direccion\" : null, \"indicativo\" : null, \"telefono\" : null, \"extension\" : null }" |