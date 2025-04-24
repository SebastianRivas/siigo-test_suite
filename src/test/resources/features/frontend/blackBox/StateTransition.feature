Feature: State Transition

    Feature que implementa la tecnica de pruebas Transicion de Estados

    Scenario: State Transition TestCase01
        Given Tester desea ingresar al login de SIIGO
        When Tester ingresa las credenciales <usr> y <passwd>
        And Tester clikea el boton Crear
        And Tester clikea la opcion Clientes
        And Tester diligencia el formulario de creacion con los datos <args>
        Then Tester verifica que se presente el campo <field>

        Examples:
            | usr                               | passwd                     | args                                 | field                                                                                                                |
            | "retoautomationsiigo@yopmail.com" | "T4b4ck0ff1c3P455w0rd658*" | "{ \"tipo_persona\" : \"empresa\" }" | "return document.querySelectorAll(\"siigo-textfield-web\").item(3).shadowRoot.querySelector(\"div > div > input\");" |

    Scenario: State Transition TestCase02
        Given Tester desea ingresar al login de SIIGO
        When Tester ingresa las credenciales <usr> y <passwd>
        And Tester clikea el boton Crear
        And Tester clikea la opcion Clientes
        And Tester diligencia el formulario de creacion con los datos <args>
        Then Tester verifica que se presente el campo <field>
        Then Tester verifica que se presente la alerta de obligatoriedad del campo
            """
            {
                "razon_social": {
                    "jsSelector": "return document.querySelectorAll(\"siigo-textfield-web\").item(3).shadowRoot.querySelectorAll(\"div\").item(2);",
                    "text": "*Campo obligatorio"
                }
            }
            """

        Examples:
            | usr                               | passwd                     | args                                                                                 | field                                                                                                                |
            | "retoautomationsiigo@yopmail.com" | "T4b4ck0ff1c3P455w0rd658*" | "{ \"tipo_persona\" : \"empresa\", \"razon_social\" : \"\", \"ciudad\" : \"Cali\" }" | "return document.querySelectorAll(\"siigo-textfield-web\").item(3).shadowRoot.querySelector(\"div > div > input\");" |

    Scenario: State Transition TestCase03
        Given Tester desea ingresar al login de SIIGO
        When Tester ingresa las credenciales <usr> y <passwd>
        And Tester clikea el boton Crear
        And Tester clikea la opcion Clientes
        And Tester diligencia el formulario de creacion con los datos <args>
        Then Tester verifica que se presente la alerta de obligatoriedad del campo
            """
            {
                "nombres": {
                    "jsSelector": "return document.querySelectorAll(\"siigo-textfield-web\").item(1).shadowRoot.querySelectorAll(\"div\").item(2);",
                    "text": "*Campo obligatorio"
                },
                "apellidos": {
                    "jsSelector": "return document.querySelectorAll(\"siigo-textfield-web\").item(1).shadowRoot.querySelectorAll(\"div\").item(2);",
                    "text": "*Campo obligatorio"
                }
            }
            """

        Examples:
            | usr                               | passwd                     | args                                                                                                  |
            | "retoautomationsiigo@yopmail.com" | "T4b4ck0ff1c3P455w0rd658*" | "{ \"tipo_persona\" : \"persona\", \"nombres\" : \"\", \"apellidos\" : \"\", \"ciudad\" : \"Cali\" }" |