package com.fernando.kotlin_dagger2.dagger

import com.fernando.kotlin_dagger2.whels.Rims.Rims
import com.fernando.kotlin_dagger2.whels.Whels
import com.fernando.kotlin_dagger2.whels.tires.Tires
import dagger.Module
import dagger.Provides

/* modulos nos ajudam a injetar dependencias quando não temos acesso a determinadas classes
** Neste modulo precisamos primeiramente Injetar os construtores que precisamos:
*   Whels, precisa de um objeto Tire e um Rim, sendo assim, criaremos com a notação @Provides
* dois metos que constroem um instancia dessas classes e por ultimo nosso objeto Whels que
* retorna uma instancia de Whels com os objetos Tires e Rims
*   E por ultimo, colocar @Component( modulo = WhelsModule)
*
*
@Component(modules = [WhelsModule::class])
interface CarComponent {

*/
@Module
class WhelsModule {

    @Provides
    fun provideRims() = Rims()

    @Provides
    fun privedeTires() : Tires{
        val tires = Tires()
        tires.inflate()
        return tires
    }


    @Provides
    fun provideWhels(rims: Rims, tires: Tires) =
        Whels(rims, tires)

}