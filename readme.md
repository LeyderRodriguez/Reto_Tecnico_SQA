
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
2. **Case2** – Selección del día 10 del próximo mes.
3. **Case3** – Validación de intento de ingreso manual en el campo de texto.

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
- 📧 leyder0232018@gmail.com
- 🔗 GitHub:
https://github.com/LeyderRodriguez?tab=repositories