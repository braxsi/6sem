var data = {
	"questions": [
		{
			"question": "<span class='bold'>Вопрос 1.</span> Как звали протагониста 'Зова Припяти'? <br> <img src='../questionnaire/v1.jpg' width='500' />",
			"answers": [
				{"answer": "Наемник Шрам "},
				{"answer": "Майор Дегтярев "},
				{"answer": "Клык"},
                {"answer": "Харон"}
			],
			"correctAnswerIndex": 1
		},
		{
			"question": "<span class='bold'>Вопрос 2.</span> С какой из представленных группировок бандиты не враждуют? <br> <img src='../questionnaire/v2.jpg' width='500' />",
			"answers": [
				{"answer": "Наемники"},
				{"answer": "Долг "},
				{"answer": "Чистое Небо"},
                {"answer": "Монолит"}
			],
			"correctAnswerIndex": 0
		},
		{
			"question": "<span class='bold'>Вопрос 3.</span> Какая зверушка посредством мутации превратилась в плоть?",
			"answers": [
				{"answer": "Лошадь"},
				{"answer": "Барсук"},
				{"answer": "Собака"},
                {"answer": "Свинья"}
			],
			"correctAnswerIndex": 3
		},
		{
			"question": "<span class='bold'>Вопрос 4.</span> С какими локациями граничат болота в 'Чистом Небе'? <br> <img src='../questionnaire/v4.jpg' width='500' /> ",
			"answers": [
				{"answer": "Свалка, Темная Долина"},
				{"answer": "Кордон, Свалка "},
				{"answer": "Кордон, Армейские склады"},
                {"answer": "Кордон, НИИ Агропром"}
			],
			"correctAnswerIndex": 3
		},
		{
			"question": "<span class='bold'>Вопрос 5.</span> В какой из локаций майор Дегтярев нашел 'Сердце Оазиса'? <br> <img src='../questionnaire/v5.jpg' width='500' />",
			"answers": [
				{"answer": "Вентиляционный комплекс"},
				{"answer": "'Шевченко'"},
				{"answer": "Южное плато"},
                {"answer": "Аномалия 'Рубец'"},
			],
			"correctAnswerIndex": 0
		},
		{
			"question": "<span class='bold'>Вопрос 6.</span> Коронная фраза Сидоровича звучит так: <br> <img src='../questionnaire/v6.jpg' width='500' />>",
			"answers": [
				{"answer": "'Да-да?'"},
				{"answer": "'Проходи - не задерживайся'"},
				{"answer": "'Ты бы еще консервных банок приволок!'"},
                {"answer": "'Иди своей дорогой, сталкер!'"}
			],
			"correctAnswerIndex": 2
		},

        {
            "question": "<span class='bold'>Вопрос 7.</span> Какое желание Стрелок не может загадать Монолиту? <br> <img src='../questionnaire/v7.jpg' width='500' />",
            "answers": [
                {"answer": "Чтобы Зона исчезла"},
                {"answer": "Богатство"},
                {"answer": "Счастье для всех, даром, и пусть никто не уйдет обиженный"},
                {"answer": "Бессмертие"}
            ],
            "correctAnswerIndex": 2
        },

        {
            "question": "<span class='bold'>Вопрос 8.</span> Какой из перечисленных сталкеров входил в группу Стрелка? <br> <img src='../questionnaire/v8.jpg' width='500' />",
            "answers": [
                {"answer": "Меченый"},
                {"answer": "Наемник Шрам"},
                {"answer": "Шустрый"},
                {"answer": "Кардан"}
            ],
            "correctAnswerIndex": 0
        },

        {
            "question": "<span class='bold'>Вопрос 9.</span> Назовите группировку, к которой ранее принадлежал Новиков: <br> <img src='../questionnaire/v9.jpg' width='500' />",
            "answers": [
                {"answer": "Монолит"},
                {"answer": "Последний День"},
                {"answer": "Чистое Небо"},
                {"answer": "Долг"}
            ],
            "correctAnswerIndex": 2
        },

        {
            "question": "<span class='bold'>Вопрос 10.</span> Назовите дату выхода S.T.A.L.K.E.R. 2: <br> <img src='../questionnaire/v10.jpg' width='500' />",
            "answers": [
                {"answer": "30.02.2019"},
                {"answer": "Конец 2011 года"},
                {"answer": "Через месяц после выхода Half-Life 3"},
                {"answer": "На этот вопрос и Григорович ответить не сможет!"}
            ],
            "correctAnswerIndex": 2
        }




    ],
	

	"result": [
		{percent: 25, text: "Ваш ранг - новичок. Не ходите дальше Кордона, а ещё лучше - выматывайтесь пока целы!"},
		{percent: 50, text: "Ваш ранг - опытный. Хотя бандиты несколько раз подумают, прежде чем содрать с вас хабар, дальше Свалки вам лучше не соваться!"},
		{percent: 75, text: "Ваш ранг - ветеран. Ваши познания Зоны весьма высоки. Наверняка Вы доходили до самой Припяти. Но с мечтами о рейде на ЧАЭС лучше пока повременить!"},
		{percent: 100, text: "Ваш ранг - мастер. Уже придумали, какое желание загадать Монолиту, когда доберётесь до него?"}
	]
};

function initQuestionnaire(data) {
	$.each(data.questions, function (index, value) {
		value.index = index;

		$.each(value.answers, function (index, value) {
			value.index = index;
		});

	});
}

initQuestionnaire(data);

var currentQuestion = 0;
var currentAnswers = [];

function showButton(root, name, enabled) {
	root.find('.qButtons .qBtnAnswer').hide();
	root.find('.qButtons .qBtnCheck').hide();
	root.find('.qButtons .qBtnContinue').hide();

	var button = root.find('.qButtons ' + name);
	button.show();
	button.prop('disabled', !enabled);
}

function answeredQuestion(checkbox) {
	var root = $(checkbox).closest(".qRoot");
	showButton(root, '.qBtnCheck', true);
}

function showQuestion(id) {
	var root = $(id);

	var template = root.find('.qQuestionTemplate');
	var html = Mustache.render(template.html(), data.questions[currentQuestion]);
	root.find('.qContent').html(html);

	showButton(root, '.qBtnCheck');
}

function showResult(id) {
	var root = $(id);

	var correctAnswers = 0;
	$.each(currentAnswers, function (index, value) {
		if (value && value.correctAnswer) {
			correctAnswers++;
		}
	});

	var percent = correctAnswers * 100 / data.questions.length;

	// look for result data

	var result = undefined;
	$.each(data.result, function (index, value) {
		if (result === undefined && percent < value.percent) {
			result = value;
		}
	});

	// 100% case
	if (result === undefined) {
		if (percent == 100) {
			result = data.result[data.result.length - 1];
		} else {
			alert('error percent=' + percent);
		}
	}

	var template = root.find('.qResultTemplate');
	var html = Mustache.render(template.html(), {
		correctAnswers: correctAnswers,
		questions: data.questions.length,
		result: result
	});

	var content = root.find('.qContent');
	content.html(html);

	showButton(root, 'hideallbuttons');
}

function answerQuestion(id) {
	var root = $(id);
	var content = root.find('.qContent');

	var answerIndex = content.find('input[name=qAnswer]:checked').val();
	if (!answerIndex) {
		alert('Выберите ответ');
		return;
	}

	var question = data.questions[currentQuestion];
	currentAnswers[question.index] = answerIndex;

	continueToNextQuestion(id);
}

function checkQuestion(id) {
	var root = $(id);
	var content = root.find('.qContent');

	var answerIndex = content.find('input[name=qAnswer]:checked').val();
	if (!answerIndex) {
		alert('Выберите ответ');
		return;
	}

	var question = data.questions[currentQuestion];
	currentAnswers[question.index] = {correctAnswer: question.correctAnswerIndex == answerIndex};

	content.find('input[name=qAnswer][value=' + question.correctAnswerIndex + ']').closest('.qAnswer').addClass("qCorrect");
	content.find('input[name=qAnswer]').prop("disabled", true);

	showButton(root, '.qBtnContinue', true);
}

function continueToNextQuestion(id) {
	currentQuestion++;
	if (currentQuestion >= data.questions.length) {
		showResult(id);
	} else {
		showQuestion(id);
	}
}

