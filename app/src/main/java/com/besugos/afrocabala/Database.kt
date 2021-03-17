package com.besugos.afrocabala

class Database {

    val definitions = mutableListOf<String>(
        "Jogo Fechado",
        "Tendência a prejudicar a própria vida e a de outros. Pode representar egoísmo, sem se importar " +
                "com os outros. Costuma gerar intrigas e separações, ainda que de pessoas próximas. " +
                "Pessoas com esse Odu são inteligentes, versáteis e passionais. Tem sorte nos negócios " +
                "e no amor, mas são inconstantes e mentem com facilidade. Tendência a ser desconfiado, " +
                "gostam de ficar sozinhos, são pensativos e preguiçosos. Possuem forte intuição.",
        "Personalidade forte e objetivos definidos. Traz franqueza, sinceridade e não aceita falsidade, ciúmes, " +
                "falta de espírito de luta. Sua regência gera pessoas tensas e nervosas. Não se preocupam com as " +
                "dificuldades a enfrentar para alcançar seus objetivos. As pessoas regidas por esse odu são intuitivas" +
                ", joviais, sinceras e honestas, porém muito geniosas e exigentes, tentando impor sua vontade.",
        "Traz a consciência de que sua força de vontade é importante para o sucesso, e é necessária " +
                "persistência e coragem para tirar o melhor proveito das situações. Este odu indica pessoas " +
                "que usam muito a razão, mas que em seu lado negativo podem trazer a mentira, a falsidade, fingimento," +
                " avareza e falsa modéstia. O homem regido por esse odu é muito viril, sério e organizado, ao passo que a" +
                " mulher é muito fértil, mas não é sensual. Ambos, porém, tendem a ser radicais, olho por olho, dente por dente.",
        "Traz a generosidade, sinceridade, sensibilidade, intuição e tendência ao misticismo. Em seu lado negativo, podem ser vítimas" +
                " de calúnias e perseguição por parte de seus inimigos, estando sujeitas a traição, difamação e ciladas armadas. " +
                "Os regidos por esse odu são pessoas gratas e que gostam de ajudar, animados, exaltados e realizadores, porém " +
                "podem ser orgulhosos e se deixar dominar pela cólera com facilidade.",
        "Traz a vaidade, a sensualidade, o gosto pelos prazeres, a ambição e a perseverança. Os " +
                "regidos por esse odu tendem a ser " +
                "pessoas calmas, que choram muito e se preocupam mais com a dor dos outros que com a sua própria, " +
                "porém nunca são reconhecidos. " + "São carismáticos, charmosos e têm grande apreço pela beleza e pelo capricho. " +
                "Cuidado com a precipitação em assuntos financeiros.",
        "Os regidos por este odu tendem a ser alegres e festivos, carregados de religiosidade, gostam de observar e manter as tradições. " +
                "Tem temperamento estourado, falam mais do que devem e são extremamente sinceros, despertando antipatia. " +
                "São pessoas saudáveis que se recuperam facilmente de qualquer doença. Tem grandes ideias, mas tem sempre " +
                "dificuldades para realizar seus planos, por falar demais e não procurar ajuda. O sofrimento, entretanto, não dura, " +
                "pois Obara abre caminhos. Tende a ser vítima de calúnia, problemas com justiça, roubos, furtos e rompimentos amorosos",
        "Os filhos de Odi são pessoas alegres, prestativas, e caridosas, que procuram obter sucesso no que fazem, porém podem são duras e inflexíveis. " +
                "São pessoas ambiciosas, com dificuldades de conter os próprios impulsos, porém muitas vezes atrapalhadas pela indecisão. " +
                "Necessitam de cuidado espiritual, para evitar maiores sofrimentos. Tem tendência ao jogo, " +
                "à adivinhação e ao oculto, sendo dotados de grande intuição. Pode representar problemas com antepassados e ancestrais.",
        "Okanran",
        "Okanran",
        "Okanran",
        "Okanran",
        "Okanran",
        "Okanran",
        "Okanran",
        "Okanran",
        "Okanran",
    )

    val odu = mutableListOf<OduModel>(
        OduModel(0, "Fechado", "Nenhum", "jogo fechado", definitions[0]),
        OduModel(1, "Okanran", "Exu", "A insubordinação", definitions[1]),
        OduModel(2, "Ejioko", "Ibeji e Ogum (Obaluae)", "A dúvida", definitions[2]),
        OduModel(3, "Etaogunda", "Obaluae e Ogum", "A obstinação", definitions[3]),
        OduModel(4, "Irosun", "Yemanja, Ogum (Oxossi)", "A calma", definitions[4]),
        OduModel(5, "Oxe", "Oxum, Logum-Ede (Ya-mi Oxoronga)", "O brilho", definitions[5]),
        OduModel(6, "Obara", "Oxossi, Xango (Logum-Ede, Ossaim, Exu)", "A riqueza", definitions[6]),
        OduModel(7, "Odi", "Exu, Omulu e Eguns (Oxala)", "A violência", definitions[7]),
        OduModel(8, "Ejionile", "Oxaguia (Xango)", "Impaciência e agitação", definitions[8]),
        OduModel(9, "Osa", "Yemanja, Yansa, Oxum (Logum-Ede)", "Desconcentração", definitions[9]),
        OduModel(10, "Ofun", "Oxala (Oxum, Yemanja, Nana)", "Virtude e desenvolvimento", definitions[10]),
        OduModel(11, "Oworin", "Yansa, Exu e Eguns", "Ansiedade", definitions[11]),
        OduModel(12, "Ejilaxebora", "Xango (Oxossi)", "Justiça e discernimento", definitions[12]),
        OduModel(13, "Ejiologbon", "Nana, Obaluae, Iku", "Tranquilidade e concentração", definitions[13]),
        OduModel(14, "Ika", "Oxumare, Ossaim (Ewa)", "Conhecimento e sabedoria", definitions[14]),
        OduModel(15, "Ogbeogunda", "Oba, Ewa (Ogum)", "Discernimento", definitions[15]),
        OduModel(16, "Alafia", "Orunmila e Oxala", "Paz", definitions[16])
        )
}