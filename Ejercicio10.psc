Algoritmo Ejercicio10
	Definir Suma, multiplo6, sumaM Como Entero
	Repetir
		Escribir  "Ingrese un numero: "
		leer num
		suma <- suma + num
		Si num MOD 6 = 0 Entonces
			multiplo6 <-multiplo6+1
		Fin Si
		Si num <= 10 Y num > 0 Entonces
			sumaM <- sumaM+1
		Fin Si
	Hasta Que suma >= 1000
	Escribir "Multiplo de 6: ",multiplo6
	Escribir "Suma de numero entre 1 y 10: ", sumaM
	
FinAlgoritmo
