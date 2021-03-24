import java.util.*

fun main(){

// VARIÁVEIS

    val reader = Scanner(System.`in`)   // Leitura de dados
    val option:Int                      // Opções de calculos
    val num1:Float                      // Primeiro número para o cálculo
    val num2:Float                      // Primeiro número para o cálculo
    val result:Float                    // Resultado

// ARMAZENAMENTO DOS CONTEÚDOS DAS VARIÁVEIS

    println("1-Soma | 2-Subtração | 3-Multiplicação | 4-Divisão") // Mostrando para o usuário os tipos de cálculos
    println("--------------------------------------------------")

    print("Escolha o número correspondente do cálculo que deseja fazer: ")
    option = reader.nextInt()                       // Escolha do tipo do cálculo

    print("\nDigite o primeiro número: ")
    num1 = reader.nextFloat()                      // Inserção do primeiro número

    print("\nDigite o segundo número: ")
    num2 = reader.nextFloat()                       // Inserção do segundo número
    
// VERIFICAÇÃO DA OPÇÃO E SE O NÚMERO É VÁLIDO

    if(option in 1..4 ){                            // Verifica se "option" tem o valor entre 1 e 4

        when(option){                               // Verifica qual o número que está declarado em "option"
            1 -> {result = num1 + num2
                print("O resultado é: $result")}

            2 -> {result = num1 - num2
                print("O resultado é: $result")}

            3 -> {result = num1 * num2
                print("O resultado é: $result")}

            4 -> {result = num1 / num2
                print("O resultado é: $result")}
        }
    }else{
        print("Opção de calculo inválida!")
    }


}