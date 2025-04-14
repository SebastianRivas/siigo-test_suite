Feature: Decision Tables

    Feature que implementa la tecnica de pruebas Tablas de Decision

    Scenario: Decision Tables TestCase01
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

    Scenario: Decision Tables TestCase02
        Given Tester desea ingresar al login de SIIGO
        When Tester ingresa las credenciales <usr> y <passwd>
        And Tester clikea el boton Crear 
        And Tester clikea la opcion Clientes
        And Tester diligencia el formulario de creacion con los datos <args>
        Then Tester verifica que se presente la alerta de obligatoriedad del campo
        """
            {
                "nombres" : {
                    "jsSelector" : "return document.querySelectorAll(\"siigo-textfield-web\").item(1).shadowRoot.querySelectorAll(\"div\").item(2);",
                    "text" : "*Campo obligatorio"
                }
            }
        """
    
    Examples:
        | usr | passwd | args |
        | "retoautomationsiigo@yopmail.com" | "T4b4ck0ff1c3P455w0rd658*" | "{ \"tipo_persona\" : \"persona\", \"tipo_identificacion\" : \"cedula_ciudadania\", \"numero_identificacion\" : \"14657890\", \"nombres\" : \"\", \"apellidos\" : \"Gomez\", \"ciudad\" : \"Cali\" }" |

    Scenario: Decision Tables TestCase03
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
                }, 
                "nombres" : {
                    "jsSelector" : "return document.querySelectorAll(\"siigo-textfield-web\").item(1).shadowRoot.querySelectorAll(\"div\").item(2);",
                    "text" : "*Campo obligatorio"
                }
            }
        """
    
    Examples:
        | usr | passwd | args |
        | "retoautomationsiigo@yopmail.com" | "T4b4ck0ff1c3P455w0rd658*" | "{ \"tipo_persona\" : \"persona\", \"tipo_identificacion\" : \"cedula_ciudadania\", \"numero_identificacion\" : \"\", \"nombres\" : \"\", \"apellidos\" : \"Gomez\", \"ciudad\" : \"Cali\" }" |