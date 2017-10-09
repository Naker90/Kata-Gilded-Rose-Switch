Gilded Rose Switch
======================================
Esta es kata esta basada en la kata de Gilded Rose
El problema de esta kata es el mismo pero esta estructurada
tienes nuevas limitaciones pensadas para aprender a refactorizar switch statement

[Enlace a Gilded Rose](https://github.com/luisrovirosa/katas-java/tree/master/gilded-rose)


Objetivo Kata
======================================

Añadir el nuevo requisito, el elemento "Conjured" en un código difícil de mantener.

Antes de cambiar el código heredado necesitamos crear prueba para asegurar que no introducimos ningún error en la producción.

Por suerte sabemos cómo usarlo y los requisitos.

Gilded Rose Requisitos Especificación
======================================

Hola y bienvenidos al equipo Gilded Rose. Como saben, somos una pequeña posada con una ubicación privilegiada en una ciudad prominente dirigida por un simpático posadero llamado Allison. También compramos y vendemos solamente las mercancías más finas. Desafortunadamente, nuestras mercancías están constantemente degradando en calidad mientras que acercan su venta por fecha. Tenemos un sistema en el lugar que actualiza nuestro inventario para nosotros. Fue desarrollado por un tipo no-absurdo llamado Leeroy, que se ha trasladado a nuevas aventuras. Su tarea es agregar la nueva característica a nuestro sistema para que podamos comenzar a vender una nueva categoría de artículos. Primero una introducción a nuestro sistema:

    - Todos los artículos tienen un valor SellIn que denota el número de días que tenemos para vender el artículo
    - Todos los artículos tienen un valor de la calidad que denota cuán valioso es el artículo
    - Al final de cada día, nuestro sistema reduce los valores para cada elemento
Bastante simple, ¿verdad? Bueno, aquí es donde se pone interesante:

    - Una vez transcurrida la fecha de caducidad, la calidad se degrada dos veces más rápido
    - La calidad de un artículo nunca es negativa
    - "Brie envejecido" en realidad aumenta en calidad más viejo consigue
    - La calidad de un artículo nunca es superior a 50
    - "Sulfuras", siendo un artículo legendario, nunca tiene que venderse o disminuir en Calidad
    - "Pase de bastidores",
        - Aumentos en la calidad como es SellIn enfoques de valor
        - La calidad aumenta en 2 cuando hay 10 días o menos
        - Por 3 cuando hay 5 días o menos pero
        - La calidad baja a 0 después del concierto
Recientemente hemos firmado un proveedor de artículos conjurados. Esto requiere una actualización de nuestro sistema:

    - Los artículos "conjurados" se degradan en calidad dos veces más rápido que los artículos normales

Siéntase libre de realizar de crear clases asi como modificar o cambiar cualquiera de las clases durante el ejercicio.

Sólo por aclaración, un artículo nunca puede tener su aumento de Calidad por encima de 50, sin embargo "Sulfuras" es un artículo legendario y como tal su Calidad es 80 y nunca se altera.