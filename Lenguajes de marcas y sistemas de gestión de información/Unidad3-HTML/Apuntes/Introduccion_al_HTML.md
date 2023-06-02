# Introducción al HTML

[W3Schools Free Online Web Tutorials](https://www.w3schools.com/)

## HTML

**HTML** (Hyper Text Markup Language):

- Lenguaje de marcado para definir estructuras de paginas web
- Usa etiquetas *predefinidas.* Se pueden tener etiquetas personalizadas
- Los navegadores no muestran las etiquetas, las usan para dar formato al contenido
- El contenido esta entre las etiquetas de apertura `<>` y cierre `</>`
    
    
    | <h1> | Encabezado | </h1> |
    | --- | --- | --- |
    | Apertura | Contenido | Cierre |

Versiones: HTML4 → XHTML → HTML5

## HTML Ejemplo

```html
<!DOCTYPE html>
<html>
    <head>
        <title>Titulo</title>
    </head>
    <body>
        <h1>Hola primer encabezado</h1>
        <p>Hola primer parrafo</p>
    </body>
</html>
```

`<!DOCTYPE html>` → Esta declaración define el documento como HTML5

Siguiendo las indicaciones del W3C (Unión de varias empresas que pretenden estandarizar HTML5) Doctype debe ser el primer elemento que abra un documento. Esto quiere decir que debería preceder a <HTML>.

Se trata de una marca que no necesita cierre y cuya función es facilitar información al servidor web que aloja la página.

El uso de DOCTYPE no es obligatorio y puede omitirse. Su uso ayuda al servidor web a interpretar correctamente el documento, pero su ausencia no condiciona la correcta visualización.

`<html>` → Elemento raíz

`<head>` → Contiene meta información (metadatos) acerca del documento, etiquetas de configuración de la pagina (y el enlace al archivo de CSS)

`<title>` → Especifica el titulo del documento

`<body>` → Contiene los elementos a visualizar

`<h1>` → Encabezado grande

`<p>` → Párrafo

## Etiqueta HTML

`<nombre_etiqueta>El contenido va aquí</etiqueta>`

- Las etiquetas HTML normalmente van en pares (`<p>con</p>`)
- La primera etiqueta es la “start tag” y la segunda es la “end tag”
- La etiqueta final se escribe igual que la inicial pero con el slash al comienzo

## Navegadores

- Uno de los propósitos de un navegador de internet es leer documentos HTML y mostrarlos por pantalla.
- El navegador no muestra las etiquetas, las usa para determinar como se va a mostrar el contenido del documento.

## Elementos HTML

Normalmente los elementos HTML tienen una etiqueta de apertura y otra de cierre con el contenido entre ambas.

`<nombre_etiqueta>Contenido aqui</nombre_etiqueta>`

El orden de los elementos corresponde al orden de los elementos de HTML.

Los elementos sin contenido se llaman elementos vacíos. Los elementos vacíos no tienen etiquetas de cierre (por ejemplo, saldo de línea, elemento `<br>`)

Los elementos en HTML pueden estar anidados (los elementos pueden contener otros elementos)

Los documentos HTML consisten en elementos anidados

Este ejemplo contiene 4 elementos:

```html
<!DOCTYPE html>
<html>
  <body>
      <h1>Hola primer encabezado</h1>
      <p>Hola primer parrafo</p>
  </body>
</html>
```

No hay que olvidarse de cerrar los elementos.

Algunos elementos se mostrarán correctamente incluso si nos olvidamos de poner la etiqueta de cierre.

```html
<p>This is a paragraph
<p>This is a paragraph
```

El ejemplo anterior funciona porque se considera opcional la etiqueta de cierre.

W3C recomienda no fiarse de esto. Podría producir errores o resultados inesperados. Siempre cerrar correctamente los elementos.

Otra recomendación de W3C es usar minúsculas para las etiquetas.

El standard HTML5 no requiere etiquetas en minúsculas, pero W3C recomienda siempre minúsculas en HTML y las requiere en documentos más estrictos como XHTML.

## HTML Básico - Headings

En HTML los encabezados (headings) vienen definidos por las etiquetas de `<h1>` hasta `<h6>`, siendo el `<h1>` el más grande y el `<h6>` el más pequeño.

Define la importancia representada por el tamaño del heading. Mínimo un h2 en cada página para un buen SEO.

## HTML Básico - Párrafos

En HTML los párrafos (paragraphs) se definen con la etiqueta `<p>`.

Es una etiqueta de bloque.

## Atributos HTML

- Todo elemento HTML puede tener atributos.
- Los atributos contienen información adicional acerca de un elemento.
- Los atributos siempre se especifican en la etiqueta inicial.
- Los atributos normalmente se escriben como pares “Nombre/valor” `nombre="valor"`

## Atributos HTML - lang

- El lenguaje del documento puede declararse en la etiqueta `<html>`
- Para ello utilizamos el atributo lang
- Declarar un lenguaje es útil para los screen readers o los motores de búsqueda.
- `<html lang="en-US">`
- Las dos primeras letras (en) especifican el lenguaje. Si hay dialecto se usan dos letras más (US).

## Atributos HTML - title

El valor del atributo title se muestra como un tooltip al pasar el ratón por encima del elemento que lo lleve.

```html
<p title="Efectivamente lo lleva"> Esto lleva un atributo title</p>
```

## Atributos HTML - href

- Los enlaces en HTML se definen con la etiqueta `<a>`. La dirección el enlace se especifica en el atributo href.

```html
<a href="https://www.w3schools.com">Esto es un enlace</a>
```

## HTML Básico - Links

En HTML los links vienen definidos por la etiqueta `<a>`.

```html
<a href="https://www.w3schools.com">Esto es un link</a>
```

El destino del link se especifica en el atributo href.

## Atributos HTML - title + href

Un elemento puede contener más de un atributo.

```html
<a title="Enlace 100% libre de virus" href="https://www.w3schools.com">Esto es un enlace</a>
```

## HTML Básico - Imágenes

En HTML las imágenes se definen con la etiqueta `<img>`.

```html
<img src="w3schools.jpg" alt="W3Schools.com" width="204" height="284">
```

Solo modificar el ancho de una imagen porque el height se redimensiona al cambiar el width.

Atributos de las imágenes:

- El archivo fuente → src
- Texto alternativo → alt
- Ancho → width
- Alto → height

## Atributos HTML - Sugerencias W3C

Las comillas dobles son las más usadas, pero también podemos usar comillas simples.

En algunas situaciones, cuando el atributo contiene un tipo de comillas, necesitamos usar el otro tipo.

```html
<p title='John "ShotGun" Nelson'>
<p title="John 'ShotGun' Nelson">
```

## HTML - Imágenes, tablas y listas

### HTML Imágenes - Usando algo de style

Anteriormente hemos visto como incluir imágenes en nuestro documento HTML.

Hay varias maneras de manipular características de las imágenes (como el tamaño).

```css
<img src="url" alt="some_text" style="width:width;height:height;">
```

Utiliza CSS (más eficiente)

```css
<img src="url" alt="some_text" style="width:204px;height:284px;">
```

Utiliza las propiedades de la etiqueta (menos eficiente)

```css
<img src="url" alt="some_text" width="204" height="284">
```

Si se cambian las características del estilo (algo que se puede hacer de manera interna o externa como veremos más adelante con CSS) las imágenes sin “Style” se verán modificadas.

```html
<!DOCTYPE html>
<html>
	<head>
		<!-- CSS interno -->
		<style>
			img {width:100%}
		</style>
	</head>
	<body>
		<img>src="html5.gif" alt="HTML5 Icon" style="width:128px;height:128px;">
		<img>src="html5.gif" alt="HTML5 Icon" width="128" height="128">
	</body>
</html>
```

### HTML Imágenes en otras localizaciones

No hace falta tener la imagen descargada en la misma carpeta donde tengas el html, puedes indicar uno ruta. Tambien se puede utilizar una imagen almacenada en cualquier web:

Ruta relativa:

```css
<img src="/images/html5.gif" alt="HTML5" style="width:128px;height:128px;">
```

Ruta absoluta:

```css
<img src="https://www.w3schools.com/images/w3schools_green.jpg" alt="W3Schools.com">
```

### HTML Links e imágenes

Anteriormente hemos visto como utilizar imágenes y links (etiquetas `<img>` y `<a>`)

¿Como podemos usar una imagen como link?

Combinando ambas etiquetas:

```html
<a href="default.asp">
	<img src="smiley.gif" alt="HTML tutorial" style="width:42px;height:42px;border:0;">
</a>
```

### HTML Imágenes de fondo

Las imágenes de fondo se definen como un atributo del elemento body.

```html
<body background="test.png"
```

O definiendo estilos en el elemento body:

```html
<body style="background-image:url('Home-blog.jpeg')">
```

### HTML - Tablas

- Las tablas se definen con la etiqueta `<table>`
- Cada fila de la tabla se define con la etiqueta `<tr>`
- Los encabezados de la tabla se definen con la etiqueta `<th>`
- Las celdas de datos se definen con la etiqueta `<td>`

### HTML - Listas

Podemos definir distintos tipos de listas en HTML:

Listas HTML sin order (unordered HTML list)

- Coffee
- Tea
- Milk

Lista HTML ordenada (ordered HTML list)

1. Coffee
2. Tea
3. Milk

### HTML - Listas sin orden

- La lista sin orden (unordered list) se define con la etiqueta `<ul>`.
- Cada item de la lista se define con la etiqueta `<li>`.

```html
<ul>
	<li>Coffee</li>
	<li>Tea</li>
	<li>Milk</li>
</ul>
```

- Se puede cambiar la manera de representar la lista (usar puntos, cuadrados, círculos) cambiando atributos de estilos como veremos mas adelante.

A modo de ejemplo:

```html
<ul style="list-style-type:square">
	<li>Coffee</li>
	<li>Tea</li>
	<li>Milk</li>
</ul>
```

### HTML - Listas ordenadas

- La lista ordenada (ordered list) se define con la etiqueta `<ol>`.
- Cada elemento de la lista se define con la etiqueta `<li>`.
    
    ```html
    <ol>
    	<li>Coffee</li>
    	<li>Tea</li>
    	<li>Milk</li>
    </ol>
    ```
    
- El atributo “type” define el tipo de marcador que va a usar la lista.
    - `type="1"`: Por defecto, la lista sera ordenada con números
    - `type="A"`: Lista ordenada con letras mayúsculas
    - `type="a"`: Lista ordenada con letras minúsculas
    - `type="I"`: Lista ordenada con números romanos mayúsculas
    - `type="i"`: Lista ordenada con números romanos minúsculas

### HTML - Listas de descripción

- Una lista de descripción es una lista de términos con una descripción de cada uno de ellos.
- La lista de descripción se define con la etiqueta `<dl>`.
- La etiqueta `<dt>` define el termino.
- La etiqueta `<dd>` define la descripción.

### HTML - Listas anidadas

- HTML permite anidar las listas (listas dentro de listas)
- Los items de las listas HTML también pueden contener mas cosas aparte de nuevas listas, como imágenes, links, etc.

```html
<ul style="list-style-type:square">
	<li>Coffee</li>
	<li>Tea</li>
		<ul>
			<li>Black tea</li>
			<li>Green tea</li>
		</ul>
	<li>Milk</li>
</ul>
```

### HTML - Secciones

Las secciones son las parted en las que se puede dividir el contenido de una pagina web.

En HTML4 la etiqueta principal para definir agrupaciones de contenido era `<div>`.

Cualquier pagina de tamaño medio acababa teniendo muchos elementos `<div>`, en algunos casos para organizar el contenido de la pagina, pero también para aplicar estilos de carácter decorativo. El código fuente resultaba así difícil de entender y mantener.

```html
<body>
	<div class="cabecera"></div>
	<div class="menu"></div>
	<div class="contenido">
		<div class="apartado"></div>
		<div class="apartado"></div>
		<div class="apartado"></div>
	</div>
	<div class="pie"><div>
</body>
```

En HTML5 se ha querido mejorar esa situación introduciendo varias etiquetas para definir diferentes tipos de secciones: `<article>`, `<section>`, `<nav>`, `<aside>`, `<header>` y `<footer>`.

La pagina del ejemplo anterior se convertiría así en:

```html
<body>
	<header></header>
	<nav></nav>
	<main>
		<section></section>
		<section></section>
		<section></section>
	</main>
	<footer></footer>
</body>
```

Al utilizar etiquetas especificas para tipos de contenido especifico, se mejora la legibilidad y facilidad de reutilización tanto del código HTML como de las hojas de estilo.

La etiqueta `<div>` se mantiene en la recomendación HTML5, pero reservada ya al resto de agrupaciones no consideradas pro las etiquetas anteriores, es decir, con fines principalmente decorativos.

### HTML Secciones - <nav>

**Navegación <nav>**

La etiqueta `<nav>` esta pensada para agrupar los enlaces a otras paginas o los enlaces a los apartados de la propia pagina.

Una pagina puede contener varios elementos `<nav>`, aunque no es necesario que todos los grupos de enlaces estén en elementos `<nav>` (por ejemplo, los enlaces de contacto que se suelen incluir en el elemento `<footer>` no requieren el uso de `<nav>`).

La imagen siguiente muestra una paginas con tres elementos `<nav>`:

El `<nav>` de `<header>` puede contener enlaces globales a otras paginas de sitio web.

El `<nav>` de `<body>` puede contener enlaces a las secciones de la pagina.

El `<nav>` de `<aside>` puede contener enlaces a otros sitios webs relacionados con el contenido de la pagina.

```html
<header>
	<nav></nav>
</header>
<nav></nav>
<main></main>
<aside>
	<nav></nav>
</aside>
<footer></footer>
```

### HTML Secciones - <section>

**Sección <section>**

La etiqueta `<section>` esta pensada para agrupar los apartados del contenido principal del documento. Normalmente, las secciones `<section>` empiezan con un titulo (`<h1>`,`<h2>`, etc.) que hace referencia al tema tratado en la sección.

```html
<main>
	<section>
		<h1></h1>
		<h2></h2>
	</section>
	<section>
		<h1></h1>
		<h2></h2>
	</section>
</main>
```

Un elemento `<section>` puede contener elementos `<section>`. Las secciones interiores se entiendes como subsecciones de la sección exterior.

```html
<main>
	<section>
		<section></section>
		<section></section>
	</section>
	<section>
		<section></section>
		<section></section>
	</section>
</main>
```

Un elemento `<section>` puede contener elementos `<article>` y viceversa.

```html
<main>
	<section>
		<article></article>
		<article></article>
	</section>
	<article>
		<section></section>
		<section></section>
	</article>
</main>
```

Las etiquetas `<section>` y `<article>` son similares. la diferencia entre ellas es que `<article`> es para partes que forman una unidad en si mismas y `<section>` es para partes de una unidad mayor.

```html
<body>
	<section>
		<h1>FPB</h1>
	</section>
	<section>
		<h1>FPGM</h1>
	</section>
	<section>
		<h1>FPGS</h1>
		<article>
			<h1>DAM</h1>
			<h1>DAW</h1>
		</article>
	</section>
</body>
```

### HTML Secciones - <article>

**Articulo <article>**

La etiqueta `<article>` esta pensada para agrupar el contenido de la pagina que forma una unidad en si misma desde el punto de vista temático. Es decir, que un articulo debería poder publicarse y leerse como documento independiente, aunque un a pagina puede estar formada por varios artículos de temática relacionada o no.

```html
<main>
	<article>
		<h1></h1>
		<h2></h2>
	</article>
	<article>
		<h1></h1>
		<h2></h2>
	</article>
</main>
```

### HTML Secciones - <aside>

**Lateral <aside>**

La etiqueta `<aside>` esta pensada para agrupar contenido secundario y tangencial al que acompaña (por ejemplo, un bloque de anuncios, un grupo de enlaces externos relacionados, una cita del texto). Normalmente se suele mostrar en los lados del documento.

El elemento `<aside>` puede estar incluido en `<body>` y entonces se entiende que se trata de contenido secundario con respecto a la pagina en su conjunto, pero también se puede incluir en `<article>` o `<section>` y entonces se entiende que se trata de contenido secundario con respecto al elemento que lo contiene.

```html
<header></header>
<nav></nav>
<main>
	<article>
		<aside></aside>
	</article>
	<article>
		<aside></aside>
	</article>
</main>
<aside></aside>
<footer></footer>
```

### HTML Secciones - <footer>

**Pie <footer>**

La etiqueta `<footer>` esta pensada para contener información general sobre el documento, información que se suele poner al final del documento: autor, direcciones de contacto, licencia o condiciones e uso, enlaces a otros documents relacionados, etc.

El elemento `<footer>` puede estar incluido en `<body>` y entonces se entiende que es el pie de pagina de la pagina en su conjunto, pero también se puede incluir en `<article>`, `<secion>`, `<nav>` y `<aside>` y entonces se entiende que es el pie de pagina del elemento que lo contiene.

```html
<header></header>
<nav>
	<header></header>
	<footer></footer>
</nav>
<main>
	<article>
		<header></header>
		<footer></footer>
	</article>
	<article>
		<header></header>
		<footer></footer>
	</article>
</main>
<aside>
	<header></header>
	<footer></footer>
</aside>
<footer></footer>
```

### HTML Secciones - <address>

**Dirección <address>**

La etiqueta `<address>` esta pensada para contener información de contacto del autor de la información (dirección de correo, teléfono, etc.) pero no otro tipo de información. Normalmente se incluye en el pie de pagina `<footer>` general de `<body>` o en el pie de pagina `<footer>` de un `<article>`.

```html
<header></header>
<nav></nav>
<main>
	<article>
		<footer>
			<address></address>
		</footer>
	</article>
	<article>
		<footer>
			<address></address>
		</footer>
	</article>
</main>
<aside></aside>
<footer>
	<address></address>
</footer>
```

La hoja de estilo por omisión de los navegadores suele mostrar el bloque de dirección `<address>` en cursiva.

```html
<footer>
	<address>Autor: Bartolomé Sintes Marco<br/>correo: bartolome.sintes@example.com</address>
	<p>Última modificaciónÑ 3 de octubre de 2017</p>
</footer>
```

---

auto-play → Atributo para que los videos (sin audio) carguen automáticamente

La línea de diseño sobre la jerarquía de una página web es muy importante para direccionar al usuario.

target → atributo de `<a>` que define el destino del enlace para abrirlo en la misma ventana o un nueva ventana (`_blank`).

span es un elemento en línea

Formas de poner CSS

1. Inline → En la línea de la etiqueta 
2. Interna → Etiquetas style dentro del head
3. Externa → En un archivo enlazado

El atributo que prevalece es el ultimo.

Elementos en vertical → Elementos en bloque

Elementos en horizontal → Elementos en línea

Separador horizontal → `<hr>`