package com.besugos.afrocabala

public class Database {

    val definitions = listOf<String>(
        "Jogo Fechado",
        "Tendência a prejudicar a própria vida e a de outros. Pode representar egoísmo, sem se importar " +
                "com os outros. Costuma gerar intrigas e separações, ainda que de pessoas próximas. " +
                "Pessoas com esse Odu são inteligentes, versáteis e passionais. Tem sorte nos negócios " +
                "e no amor, mas são inconstantes e mentem com facilidade. Tendência a ser desconfiado, " +
                "gostam de ficar sozinhos, são pensativos e preguiçosos. Possuem forte intuição. \n",
        "Personalidade forte e objetivos definidos. Traz franqueza, sinceridade e não aceita falsidade, ciúmes, " +
                "falta de espírito de luta. Sua regência gera pessoas tensas e nervosas. Não se preocupam com as " +
                "dificuldades a enfrentar para alcançar seus objetivos. As pessoas regidas por esse odu são intuitivas" +
                ", joviais, sinceras e honestas, porém muito geniosas e exigentes, tentando impor sua vontade. \n",
        "Traz a consciência de que sua força de vontade é importante para o sucesso, e é necessária " +
                "persistência e coragem para tirar o melhor proveito das situações. Este odu indica pessoas " +
                "que usam muito a razão, mas que em seu lado negativo podem trazer a mentira, a falsidade, fingimento," +
                " avareza e falsa modéstia. O homem regido por esse odu é muito viril, sério e organizado, ao passo que a" +
                " mulher é muito fértil, mas não é sensual. Ambos, porém, tendem a ser radicais, olho por olho, dente por dente. \n",
        "Traz a generosidade, sinceridade, sensibilidade, intuição e tendência ao misticismo. Em seu lado negativo, podem ser vítimas" +
                " de calúnias e perseguição por parte de seus inimigos, estando sujeitas a traição, difamação e ciladas armadas. " +
                "Os regidos por esse odu são pessoas gratas e que gostam de ajudar, animados, exaltados e realizadores, porém " +
                "podem ser orgulhosos e se deixar dominar pela cólera com facilidade.\n",
        "Traz a vaidade, a sensualidade, o gosto pelos prazeres, a ambição e a perseverança. Os " +
                "regidos por esse odu tendem a ser " +
                "pessoas calmas, que choram muito e se preocupam mais com a dor dos outros que com a sua própria, " +
                "porém nunca são reconhecidos. " + "São carismáticos, charmosos e têm grande apreço pela beleza e pelo capricho. " +
                "Cuidado com a precipitação em assuntos financeiros.\n",
        "Os regidos por este odu tendem a ser alegres e festivos, carregados de religiosidade, gostam de observar e manter as tradições. " +
                "Tem temperamento estourado, falam mais do que devem e são extremamente sinceros, despertando antipatia. " +
                "São pessoas saudáveis que se recuperam facilmente de qualquer doença. Tem grandes ideias, mas tem sempre " +
                "dificuldades para realizar seus planos, por falar demais e não procurar ajuda. O sofrimento, entretanto, não dura, " +
                "pois Obara abre caminhos. Tende a ser vítima de calúnia, problemas com justiça, roubos, furtos e rompimentos amorosos \n",
        "Os filhos de Odi são pessoas alegres, prestativas, e caridosas, que procuram obter sucesso no que fazem, porém podem são duras e inflexíveis. " +
                "São pessoas ambiciosas, com dificuldades de conter os próprios impulsos, porém muitas vezes atrapalhadas pela indecisão. " +
                "Necessitam de cuidado espiritual, para evitar maiores sofrimentos. Tem tendência ao jogo, " +
                "à adivinhação e ao oculto, sendo dotados de grande intuição. Pode representar problemas com antepassados e ancestrais.\n",
        "Este Odu significa vaidade, orgulho, ajuntamento de corpos, gozo, proteção, simpatia, estruturação, " +
                "interiorização, expansão geral, fortuna, sucesso e amor, mas se tiver negativo pode trazer " +
                "muita ruína, doenças, destruição no lar, traições, brigas, esquecimento de amizade e desavenças. " +
                "Pode indicar mudanças no amor, no trabalho, problemas de saúde, perseguições e fofocas. Risco de " +
                "acidentes e doenças graves.\n",
        "O instinto protetor e a religiosidade caracterizam os regidos por Osa. " +
                "Seus pontos vulneráveis são os conflitos psicológicos. " +
                "Tem como característica o autoritarismo, caprichos e teimosias, qualidades essas que levam " +
                "a grandes transtornos, caminhos fechados, acidentes em viagens e toda a sorte de influência de maus espíritos, " +
                "causando constantemente falsidades e perseguições, o que ocasiona muitos desgostos." +
                "São pessoas donas de si, mandonas e desobedientes, mas seu autoritarismo lhes cria sérios problemas, inclusive conjugais.\n",
        "Odu que traz o mistério. As pessoas regidas por Ofun são sinceras, honestas, inteligentes e espiritualmente elevadas." +
                "São pessoas caladas, envelhecidas interiormente, aparentando muita calma e paciência." +
                "Pessoas com esse Odu são inteligentes, fiéis e honestas, capazes de dedicar atenção total ao seu amor." +
                "Em contrapartida, mostram-se muito teimosas e rancorosas. Tendem a sofrer perseguições e desilusões amorosas." +
                "O sucesso material depende do sucesso espiritual.\n",
        "Pessoas com esse Odu têm imaginação fértil, boa saúde e vida longa, mas as más influências e a " +
                "falta de fé as levam a enfrentar dificuldades materiais e a só alcançar o sucesso depois de " +
                "grandes sacrifícios. São muito volúveis no amor. Devem ter cuidado para não se tornar obstinados por sucesso, " +
                "felizes quando buscam profissões liberais que atuam junto ao público. Possuem muita energia, disposição " +
                "e estão em constante movimento, agito. Podem ser muito nervosos, vingativos e defendem-se atacando.\n",
        "Geralmente são pessoas agradáveis, boas, simpáticas, prestativas, inteligentes, arrogantes, mas de bom coração. " +
                "Tendem a cultivar relacionamentos superficiais e numerosos e dificilmente assumem compromissos que durem muito tempo, " +
                "o que provoca uma constante troca de parceiros. Costumam se entediar até com as melhores coisas da vida." +
                "Pessoas regidas por Ejilaxebora têm o dom de convencer os outros, embora às vezes se mostrem arrogantes. " +
                "Podem ser pessoas barulhentas, orgulhosas, vaidosas ao extremo, prepotentes, autoritários, volúveis e sovinas." +
                "Gostam de intrigas e de manipular as pessoas e as situações.\n",
        "Os filhos deste Odu são pessoas dóceis, que preferem ser dirigidas e orientadas por alguém em que depositam confiança cega. " +
                "Preferem viver em grupo. Tem facilidade de descobrir novos caminhos e recomeçar. Podem ser teimosos, rancorosos, " +
                "humildes, impacientes, zelosos, dóceis, conservadores. Possuem difícil trato, são bastante introspectivos. " +
                "Em geral são pessoas com temperamento e aparência de pessoas mais velhas.\n",
        "As pessoas regidas por Iká são sempre muito confiantes e, por essa razão, desperdiçam várias chances e acabam se arrependendo. " +
                "Detestam a solidão. Podem ser pessoas impulsivas, violentas e difíceis de lidar, pois estão sempre em estado de defesa. " +
                "Estão sempre em movimento, nunca medem as consequências e nem hesitam diante do perigo, porém não têm muita firmeza no que querem. " +
                "Costuma trazer sorte com dinheiro. \n",
        "Os regidos por esse odu tendem a brigar muito em casa e no trabalho, quase sempre sem motivo, depois se arrependendo." +
                "São pessoas corajosas, audaciosas, presunçosas, mas muito solícitas e prontas a socorrer quantos necessitem de seus préstimos." +
                "Possuem caráter altivo, sarcástico e indisciplinado." +
                "Tendem a ser pessoas valorosas, combativas e imparciais, mas costumam sofrer desilusões amorosas, " +
                "o que acentua sua agressividade e seu sentimento de rejeição.\n",
        "Os regidos por Alafia alcançam triunfo em tudo, lucros, heranças, viagens, felicidade, boas propostas, " +
                "porém são pessoas que sempre precisam de orientação espiritual. " +
                "Caminhos repletos de fartura, progresso, prosperidade, felicidade e amor, apesar de haver muita inveja, ciúmes e falsidades.\n",
    )

    val odu = listOf<OduModel>(
        OduModel(0, "Fechado", "Nenhum", "jogo fechado", definitions[0]),
        OduModel(1, "Okanran", "Exu", "A insubordinação", definitions[1]),
        OduModel(2, "Ejioko", "Ibeji e Ogum (Obaluae)", "A dúvida", definitions[2]),
        OduModel(3, "Etaogunda", "Obaluae e Ogum", "A obstinação", definitions[3]),
        OduModel(4, "Irosun", "Yemanja, Ogum (Oxossi)", "A calma", definitions[4]),
        OduModel(5, "Oxe", "Oxum, Logum-Ede (Ya-mi Oxoronga)", "O brilho", definitions[5]),
        OduModel(6, "Obara", "Oxossi, Xango (Logum-Ede, Ossaim, Exu)", "A riqueza", definitions[6]),
        OduModel(7, "Odi", "Exu, Omulu e Eguns (Oxala)", "A violência", definitions[7]),
        OduModel(8, "Ejionile", "Oxaguia (Xango)", "A intranquilidade", definitions[8]),
        OduModel(9, "Osa", "Yansa, Yemanja, Egum", "A alienação", definitions[9]),
        OduModel(10, "Ofun", "Oxala (Oxum, Yemanja, Nana)", "A doença", definitions[10]),
        OduModel(11, "Oworin", "Yansa, Exu e Eguns", "A pressa", definitions[11]),
        OduModel(12, "Ejilaxebora", "Xango (Oxossi)", "A justiça", definitions[12]),
        OduModel(13, "Ejiologbon", "Nana, Obaluae, Iku", "A concentração", definitions[13]),
        OduModel(14, "Ika", "Oxumare, Ossaim (Ewa)", "A sabedoria", definitions[14]),
        OduModel(15, "Ogbeogunda", "Oba, Ewa (Ogum)", "O discernimento", definitions[15]),
        OduModel(16, "Alafia", "Orunmila e Oxala", "a Paz", definitions[16])
        )

    val posicao = listOf<String>(
            "Rege a imagem que passa aos outros",
            "Rege a força que impulsiona",
            "Rege o lado material da vida",
            "Rege o lado espiritual da vida",
            "Rege a essência",
            "Rege a totalidade do caminho",
            "Rege a espiritualidade e a vida (método Odulefa Modugbaye)",
            "Rege os obstáculos a superar na vida (método Odulefa Modugbaye)"
    )

}