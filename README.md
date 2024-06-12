# RepoAutomation

## Descripción
`RepoAutomation` es un proyecto de automatización basado en Java que utiliza Maven y TestNG. Está diseñado para automatizar pruebas de navegador, garantizando la robustez y fiabilidad de aplicaciones web.

## Características
- Pruebas en diferentes navegadores
- Integración con Maven
- Ejecución de pruebas con TestNG

## Requisitos
- Java 8 o superior
- Maven 3.6 o superior
- WebDriver (ChromeDriver, GeckoDriver, etc.)

## Instalación
1. Clona el repositorio:
    ```bash
    git clone https://github.com/LorenaMartinsSanchez/RepoAutomation.git
    ```
2. Navega al directorio del proyecto:
    ```bash
    cd RepoAutomation
    ```
3. Instala las dependencias:
    ```bash
    mvn clean install
    ```

## Ejecución de Pruebas
- Para ejecutar las pruebas, ejecuta:
    ```bash
    mvn test
    ```
- Para ejecutar pruebas específicas definidas en `testng.xml`:
    ```bash
    mvn -DsuiteXmlFile=testng.xml test
    ```

## Estructura del Proyecto
- **src/**: Contiene el código fuente principal y los casos de prueba
- **Drivers/**: Directorio para los ejecutables de WebDriver
- **test-output/**: Directorio donde se almacenan los resultados de las pruebas
- **pom.xml**: Archivo de configuración de Maven
- **testng.xml**: Archivo de configuración de TestNG

## Contribuciones
1. Haz un fork del repositorio
2. Crea una nueva rama (`git checkout -b feature-branch`)
3. Realiza tus cambios (`git commit -m 'Agregar nueva característica'`)
4. Sube los cambios a la rama (`git push origin feature-branch`)
5. Crea un nuevo Pull Request

## Licencia
Este proyecto está licenciado bajo la Licencia MIT.
