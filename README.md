# SIIGO TEST SUITE (JAVA + SERENITY + CUCUMBER + SCREENPLAY)

Este proyecto contiene la automatizacion a la prueba tecnica propuesta

## ESTRUCTURA DE DIRECCTORIOS 🗂️

```bash
.
├── pom.xml
├── README.md
├── serenity.properties
├── src
│   ├── main
│   │   └── java
│   │       └── com
│   │           └── siigo
│   │               └── app
│   │                   ├── interactions
│   │                   │   ├── ShadowClick.java
│   │                   │   ├── ShadowSendKeys.java
│   │                   │   └── SleepThread.java
│   │                   ├── models
│   │                   │   └── User.java
│   │                   ├── pageobjects
│   │                   │   ├── DashboardPage.java
│   │                   │   ├── LoginPage.java
│   │                   │   └── ThirdPartyPage.java
│   │                   ├── questions
│   │                   │   ├── ElementHasText.java
│   │                   │   ├── ElementIsVisible.java
│   │                   │   ├── ShadowHasText.java
│   │                   │   ├── ShadowIsVisible.java
│   │                   │   └── ShadowValue.java
│   │                   ├── tasks
│   │                   │   ├── dashboard
│   │                   │   │   └── WaitDashboardPageLoaded.java
│   │                   │   ├── login
│   │                   │   │   ├── LoginUser.java
│   │                   │   │   └── WaitLoginPageLoaded.java
│   │                   │   ├── NavigateTo.java
│   │                   │   └── thirdparty
│   │                   │       ├── CreateThirdParty.java
│   │                   │       ├── ValidateAlerts.java
│   │                   │       ├── WaitThirdPartyCreated.java
│   │                   │       └── WaitThirdPartyPageLoaded.java
│   │                   └── utils
│   └── test
│       ├── java
│       │   └── com
│       │       └── siigo
│       │           └── app
│       │               ├── CucumberTestSuite.java
│       │               ├── runners
│       │               │   ├── BackendRunner.java
│       │               │   └── FrontendRunner.java
│       │               └── stepdefinitions
│       │                   ├── LoginStepDefinitions.java
│       │                   ├── ParameterDefinitions.java
│       │                   └── ThirdPartyStepDefinitions.java
│       └── resources
│           ├── features
│           │   ├── backend
│           │   │   └── whiteBox
│           │   └── frontend
│           │       ├── blackBox
│           │       │   ├── DecisionTables.feature
│           │       │   ├── EquivalenceSplitting.feature
│           │       │   ├── LimitValue.feature
│           │       │   └── StateTransition.feature
│           │       └── e2e
│           │           ├── Login.feature
│           │           └── ThirdParty.feature
│           ├── logback-test.xml
│           ├── serenity.conf
│           └── webdriver
│               ├── linux
│               │   └── chromedriver
│               ├── mac
│               └── windows
└── target
```

## EJECUCION DEL PROYECTO ⌨️

⚠️ La compilacion y posterior ejecucion del proyecto se debe hacer desde la raiz del proyecto ⚠️

⚠️ La salida del programa se almacena en ⚠️

```bash
target/site/serenity/
```

Para verificar el resultado de las pruebas se debe abrir el archivo index.html

- Compilacion y ejecucion

```bash
mvn clean verify
```

## MATRIZ DE DISEÑO DE PRUEBAS

[Pruebas de Caja Negra](https://docs.google.com/spreadsheets/d/e/2PACX-1vTsTp2wyT1yzfBx3pP7bpsRLO8hzkkj-t5_w8uVrh21xh2E9U_Uue6FHK0olVY1aSEz90i4Kb6FUI37/pubhtml)

## CONSIDERACIONES DEL PROYECTO

- Varios elemento se tuvieron que mapear por JavScrip ya que estos se encuentran en un Shadow DOM inaccesible por Serenity o Selenium de manera convencional.
- Si un aprueba falla no necesariamente es que exista un error, puede darse la situcion que el elemento se demoro en cargar en el DOM y no aparece justo en el momento que se hace la interaccion con este.
