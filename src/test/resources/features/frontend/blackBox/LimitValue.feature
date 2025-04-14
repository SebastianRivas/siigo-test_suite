Feature: Limit Value

    Feature que implementa la tecnica de pruebas Analisi del Valor Limite

    Scenario: Limit Value TestCase01
        Given Tester desea ingresar al login de SIIGO
        When Tester ingresa las credenciales <usr> y <passwd>
        And Tester clikea el boton Crear 
        And Tester clikea la opcion Clientes
        And Tester diligencia el formulario de creacion con los datos <args>
        Then Tester verifica que se presente la alerta de valor invalido <message>
    
    Examples:
        | usr | passwd | args | message |
        | "retoautomationsiigo@yopmail.com" | "T4b4ck0ff1c3P455w0rd658*" | "{ \"tipo_persona\" : \"persona\", \"tipo_identificacion\" : \"cedula_ciudadania\", \"numero_identificacion\" : \"3\", \"nombres\" : \"Juan\", \"apellidos\" : \"Gomez\", \"ciudad\" : \"Cali\" }" | "El campo 'Identificación' debe contener un mínimo de 3 caracteres y un máximo de 13." |

    Scenario: Limit Value TestCase02
        Given Tester desea ingresar al login de SIIGO
        When Tester ingresa las credenciales <usr> y <passwd>
        And Tester clikea el boton Crear 
        And Tester clikea la opcion Clientes
        And Tester diligencia el formulario de creacion con los datos <args>
        Then Tester verifica que se presente la alerta de valor invalido <message>
    
    Examples:
        | usr | passwd | args | message |
        | "retoautomationsiigo@yopmail.com" | "T4b4ck0ff1c3P455w0rd658*" | "{ \"tipo_persona\" : \"persona\", \"tipo_identificacion\" : \"cedula_ciudadania\", \"numero_identificacion\" : \"52676812894678134785048874860440923235259424194466\", \"nombres\" : \"Juan\", \"apellidos\" : \"Gomez\", \"ciudad\" : \"Cali\" }" | "El campo 'Identificación' debe contener un mínimo de 3 caracteres y un máximo de 13." |

    Scenario: Limit Value TestCase03
        Given Tester desea ingresar al login de SIIGO
        When Tester ingresa las credenciales <usr> y <passwd>
        And Tester clikea el boton Crear 
        And Tester clikea la opcion Clientes
        And Tester diligencia el formulario de creacion con los datos <args>
        Then Tester verifica que se presente la alerta de obligatoriedad del campo
        """
            {
                "identificacion" : {
                    "jsSelector" : "return document.querySelector(\"siigo-identification-input-web\").shadowRoot.querySelector(\"div > div[class='error-text text red']\");",
                    "text" : "*Campo obligatorio"
                }
            }
        """
    
    Examples:
        | usr | passwd | args |
        | "retoautomationsiigo@yopmail.com" | "T4b4ck0ff1c3P455w0rd658*" | "{ \"tipo_persona\" : \"persona\", \"tipo_identificacion\" : \"cedula_ciudadania\", \"numero_identificacion\" : \"\", \"nombres\" : \"Juan\", \"apellidos\" : \"Gomez\", \"ciudad\" : \"Cali\" }" |