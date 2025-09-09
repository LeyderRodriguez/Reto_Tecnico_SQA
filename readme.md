
# Reto Técnico SQA – Automatización con SerenityBDD

Este proyecto corresponde a la **prueba técnica de automatización** usando **SerenityBDD + Cucumber + Selenium**.  
El objetivo es automatizar pruebas sobre el componente **Datepicker de JQuery UI**.

---

## Tecnologías utilizadas
- **Java 8+**
- **Gradle**
- **SerenityBDD 2.x**
- **Cucumber**
- **Selenium WebDriver**
- **Serenity.conf** para configuración de navegador (Chrome)

---

## Escenarios implementados
1. **Case1** – Selección del día 15 del mes actual.
    <p align="center">
      <img src=".img/case1.png" alt="Caso 1" width="450"/>
    </p>


2. **Case2** – Selección del día 10 del próximo mes.
    <p align="center">
      <img src=".img/case2.png" alt="Caso 2" width="450"/>
    </p>


3. **Case3** – Validación de intento de ingreso manual en el campo de texto.
    _"El escenario de validación del campo bloqueado se implementó de acuerdo con el enunciado.
    Sin embargo, durante la ejecución se observó que el componente Datepicker de JQuery UI sí permite
    la entrada manual de texto en el input. Por esa razón, el escenario falla, mostrando el
    comportamiento real de la aplicación bajo prueba."_
   <p align="center">
      <img src=".img/case3.png" alt="Caso 3" width="450"/>
    </p>

---

## Ejecución de pruebas
En la raíz del proyecto:

```bash
./gradlew clean test aggregate
```

---

## Ruta del Reporte:
**target/site/serenity/index.html**

---

## 👨‍💻 **Autor**
Leyder Leoncio Rodriguez
- **📧 Correo:** leyder0232018@gmail.com
- **🔗 GitHub:** https://github.com/LeyderRodriguez?tab=repositories