Feature: Equivalence Splitting

    Feature que implementa la tecnica de pruebas Particion de Equivalencias

    Scenario: Equivalence Splitting TestCase01
        Given Tester desea ingresar al login de SIIGO
        When Tester ingresa las credenciales <usr> y <passwd>
        And Tester clikea el boton Crear 
        And Tester clikea la opcion Clientes
        And Tester diligencia el formulario de creacion con los datos <args>
        Then Tester verifica que se haya creado correctamente el tercero
    
    Examples:
        | usr | passwd | args |
        | "retoautomationsiigo@yopmail.com" | "T4b4ck0ff1c3P455w0rd658*" | "{ \"tipo_persona\" : \"persona\", \"tipo_identificacion\" : \"cedula_ciudadania\", \"numero_identificacion\" : \"960124781\", \"nombres\" : \"Juan\", \"apellidos\" : \"Gomez\", \"ciudad\" : \"Cali\" }" |

    Scenario: Equivalence Splitting TestCase02
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