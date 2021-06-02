package com.fernando.kotlin_dagger2.engine

import javax.inject.Inject
/*
Usando Injeção em uma interface
    Há casos que devemos realizar um Injeção em uma interface
    Neste caso Temos 2 tipos de motor para a classe Car, a classe Car não sabe que tipo de motor
    recebe.

    Temos duas classes Diesel e Petrol, nessas classes fazemos o procedimento padrão de @Injec nos construtores
    e implementamos a interface Engine

 */

interface Engine{

    fun start()
}


