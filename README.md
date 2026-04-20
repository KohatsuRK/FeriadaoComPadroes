# Feriadao Com Padroes - Disciplina Projetos Orientados a Objetos
# Exercício Prático: Mestre de Dungeon 
Uma desenvolvedora de jogos indie deseja criar um motor robusto para gerenciar masmorras procedurais em um RPG. 
O sistema deve ser altamente modular, permitindo que novos monstros, equipamentos e comportamentos sejam adicionados 
sem a necessidade de reescrever o núcleo do jogo.

A engine precisa lidar com a criação dinâmica de criaturas, 
garantir que as regras globais da masmorra sejam universais, 
proteger áreas críticas de jogadores inexperientes e permitir que o combate seja iniciado de forma simples, 
mesmo envolvendo múltiplos subsistemas (luz, som, gestão). 
Além disso, as armas devem ser customizáveis e os monstros devem reagir 
de forma inteligente ao seu estado de saúde, notificando o sistema de interface sempre que um evento relevante (como uma morte) ocorrer.

### Objetivo
Implementar um sistema de gerenciamento de masmorras orientado a objetos que:
<ul>
    <li>Garantir que exista apenas uma instância central do NucleoDaMasmorra para gerenciar as configurações globais, como a dificuldade do mundo e o recorde de jogadores;</li>
    <li>Centralizar a criação de criaturas (Orcs, Esqueletos, Dragões) através da FabricaDeMonstros, para que o jogo obtenha novos inimigos sem precisar conhecer os detalhes de construção de cada um;</li>
    <li>Intermediar o acesso ao Chefe Final através de um PortaoMagico, que valida se o jogador possui o nível necessário antes de permitir o início do combate;</li>
    <li>Unificar a entrada de comandos para que o sistema aceite tanto teclados antigos quanto controles de consoles modernos de forma transparente para a lógica do jogo;</li>
    <li>Simplificar a complexidade de iniciar um encontro no ModoBatalha, oferecendo uma interface única que automatiza o ajuste de luz, música e posicionamento dos monstros;</li>
    <li>Permitir que uma espada receba múltiplos encantamentos (Fogo, Gelo, Veneno) de forma dinâmica e cumulativa, adicionando novos poderes sem alterar a classe base da arma;</li>
    <li>Permitir que a inteligência dos monstros alterne entre diferentes estilos de combate (como "Ataque Furioso" e "Defesa Estratégica") em tempo real, dependendo da sua barra de vida;</li>
    <li>Notificar automaticamente múltiplos sistemas (como o PainelDeStatus e o DistribuidorDeXP) no exato momento em que a vida de um monstro chegar a zero;</li>
    <li>Demonstrar separação de responsabilidades clara entre as classes e incluir testes de unidade que validem se os comportamentos mudam corretamente conforme as condições do jogo.</li>
</ul>
