package com.example.questiontest.domain;

import com.example.questiontest.data.madel.Question;
import com.example.questiontest.data.madel.QuestionData;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class AppControl {
    private static AppControl appControl;
    private static Question question;
    private static final List<QuestionData> questionData = new ArrayList<>();

    private AppControl() {
    }

    ;

    static public AppControl geInstance() {
        if (appControl == null) {
            appControl = new AppControl();
        }
        return appControl;
    }

    //    private Question getQuestionENAM(){
//        return question;
//    }
    public void setQuestion(Question question) {
        AppControl.question = question;
        geQuestion();
    }

    public List<QuestionData> getQuestiondat() {
       Collections.shuffle(Collections.singletonList(questionData) );

        return questionData.subList(0,10);
    }

    private void geQuestion() {
        questionData.clear();
        switch (question) {
            case MATIMATIKA: {
                questionData.add(new QuestionData("Kvadratik tenglamalar: 2x² + 5x - 3 ni yeching", "4", "-1", "1", "7", "-1"));
                questionData.add(new QuestionData("Daraja funksiyalari: 3² + 4² ni hisoblang", "25", "27", "21", "7", "25"));
                questionData.add(new QuestionData("Trigonometriya: sin(30°) ning qiymatini toping", "3", "1,5", "1", "0,6", "0,5"));
                questionData.add(new QuestionData("Geometriya: To'g'ri burchakli uchburchakning yuzini hisoblang, uning tomonlari 5 cm va 7 cm.", "3", "5", "6", "21", "21"));
                questionData.add(new QuestionData("Murakkab sonlar: 35 ning bo'luvchilarini toping.", "3,6,9", "1,5,6,7", "6", "7", "1,5,6,7"));
                questionData.add(new QuestionData("vadratik tenglamalar: x² - 6x + 9 ni yeching.", "9", "5", "6", "7", "9"));
                questionData.add(new QuestionData("Daraja funksiyalari: 4³ + 2² ni hisoblang", "20", "5", "21", "7", "20"));
                questionData.add(new QuestionData("Trigonometriya: cos(60°) ning qiymatini toping", "1", "5", "6", "7", "1"));
                questionData.add(new QuestionData("To'g'ri burchakli uchburchakning yuzini hisoblang, uning tomonlari 10 cm va 12 cm.", "33", "55", "76", "97", "96"));
                questionData.add(new QuestionData("Murakkab sonlar: 42 ning bo'luvchilarini toping.", "1,2,3,6,7,14,21,42", "5", "6,4,7", "7", "1,2,3,6,7,14,21,42"));
                questionData.add(new QuestionData("Daraja funksiyasi: 2² + 3³ ni hisoblang.", "13", "5", "6", "7", "13"));
                questionData.add(new QuestionData("Trigonometriya: cos(60°) ning qiymatini toping", "3", "1", "6", "7", "1"));
                questionData.add(new QuestionData("Geometriya: Doira yuzini hisoblang, uning radiusi 128 cm", "3", "5", "256", "7", "128"));
                questionData.add(new QuestionData("Murakkab sonlar: 72 ning bo'luvchilarini toping", "1, 2, 3, 4, 6, 8, 9, 12, 18, 24, 36, 72", "5,6,7,8", "6,90,45", "7", "1, 2, 3, 4, 6, 8, 9, 12, 18, 24, 36, 72"));
                questionData.add(new QuestionData("Proporsiya: 15 ta puldan 3 ta olish uchun nechta pul kerak?", "3", "5", "4", "7", "4"));
                questionData.add(new QuestionData("Kvadratik tenglamalar: x² - 9x + 18 ni yeching", "3", "5", "6", "7", "3"));
                questionData.add(new QuestionData("Daraja funksiyalari: 5² - 4² ni hisoblang", "21", "5", "16", "17", "21"));
                questionData.add(new QuestionData("Trigonometriya: sin(45°) ning qiymatini toping", "3", "1", "24", "7", "1"));
                questionData.add(new QuestionData("16 ning kvadrat ildizi qancha?", "2", "4", "8", "16", "4"));
                questionData.add(new QuestionData("9 × 7 = ?", "56", "63", "72", "81", "63"));
                questionData.add(new QuestionData("Pi (π) qiymati ikki belgidan keyin qancha?", "3.14", "3.16", "3.18", "3.20", "3.14"));
                questionData.add(new QuestionData("Uzunligi 6 birlik, eni 4 birlik bo'lgan to'g'ri to'rtburchakning yuzasi qancha?", "10", "16", "20", "24", "24"));
                questionData.add(new QuestionData("Bir tomoni 10 birlik kvadratning perimetri qancha?", "30", "40", "50", "60", "40"));
                questionData.add(new QuestionData("15 / 3 = ?", "3", "5", "10", "15", "5"));
                questionData.add(new QuestionData("4 ning kvadrati qancha?", "2", "8", "12", "16", "16"));
                questionData.add(new QuestionData("Agar x = 3 va y = 5 bo'lsa, x + y = ?", "5", "8", "10", "15", "8"));
                questionData.add(new QuestionData("7 dan keyingi birinchi soddalik soni qaysi?", "9", "10", "11", "12", "11"));
                questionData.add(new QuestionData("12 - 7 = ?", "3", "5", "7", "12", "5"));
                questionData.add(new QuestionData("Agar a = 4 va b = 6 bo'lsa, a * b = ?", "10", "20", "24", "36", "24"));
                questionData.add(new QuestionData("3ning kubi qancha?", "6", "9", "12", "27", "27"));
                questionData.add(new QuestionData("2 ning 5 darajasi qancha?", "4", "8", "16", "32", "32"));
                questionData.add(new QuestionData("Uchburchakning ichki burchaklar yig'indisi qancha?", "90 daraja", "180 daraja", "270 daraja", "360 daraja", "180 daraja"));
                questionData.add(new QuestionData("| -8 | = ?", "8", "-8", "0", "Definitsiya yo‘q", "8"));
                questionData.add(new QuestionData("7 / 2 (yaqin butun son bo'lib) = ?", "3", "3.5", "4", "4.5", "4"));
                questionData.add(new QuestionData("8 dan keyingi birinchi Fibonacci ketma-ketligi soni qaysi?", "9", "10", "11", "13", "13"));
                questionData.add(new QuestionData("log₁₀ 100 qiymati qancha?", "1", "2", "10", "100", "2"));
                questionData.add(new QuestionData("10 ta tabiiy sonlar yig'indisi qancha?", "45", "50", "55", "60", "55"));
                questionData.add(new QuestionData("sin(90 daraja) qiymati qancha?", "0", "1", "-1", "Definitsiya yo‘q", "1"));
                questionData.add(new QuestionData("3 faktoriali qancha?", "3", "6", "9", "12", "6"));
                questionData.add(new QuestionData("Radiusi 5 birlik bo'lgan doiraning yuzasi qancha? (ikkita butun sondan keyin ildizlar qarshilik bilan yaxlitlashgan)", "15.70", "25.12", "31.42", "78.54", "78.54"));
                questionData.add(new QuestionData("tan(45 daraja) qiymati qancha?", "0", "1", "-1", "Definitsiya yo‘q", "1"));
                questionData.add(new QuestionData("5ning 0-darajada kuchlari qancha?", "0", "1", "5", "Definitsiya yo‘q", "1"));
                questionData.add(new QuestionData("Uzunligi 8 birlik, eni 6 birlik bo'lgan to'g'ri to'rtburchakning perimetri qancha?", "12", "20", "24", "30", "28"));
                questionData.add(new QuestionData("cos(0 daraja) qiymati qancha?", "0", "1", "-1", "Definitsiya yo‘q", "1"));
                questionData.add(new QuestionData("9 / 0 = ?", "0", "1", "Definitsiya yo‘q", "Sonsizlik", "Definitsiya yo‘q"));
                questionData.add(new QuestionData("Bosiq 10 birlik, balandligi 8 birlik bo'lgan uchburchakning yuzasi qancha?", "40", "48", "60", "80", "40"));
                questionData.add(new QuestionData("log₂ 16 qiymati qancha?", "2", "4", "8", "16", "4"));
                questionData.add(new QuestionData("2π qiymati qancha?", "3.14", "6.28", "9.42", "12.56", "6.28"));
                questionData.add(new QuestionData("sin(0 daraja) qiymati qancha?", "0", "1", "-1", "Definitsiya yo‘q", "0"));
                questionData.add(new QuestionData("10 - 16 ning qiymati qancha?", "2", "4", "6", "8", "6"));
                questionData.add(new QuestionData("| -12 | = ?", "12", "-12", "0", "Definitsiya yo‘q", "12"));
                questionData.add(new QuestionData("2 ning 10 darajasi qancha?", "1024", "2048", "4096", "8192", "1024"));
                questionData.add(new QuestionData("To'rtburchakning barcha burchaklar yig'indisi qancha?", "180 daraja", "270 daraja", "360 daraja", "450 daraja", "360 daraja"));
                questionData.add(new QuestionData("tan(0 daraja) qiymati qancha?", "0", "1", "-1", "Definitsiya yo‘q", "0"));


                questionData.add(new QuestionData("Geometriya: To'g'ri burchakli uchburchakning yuzini hisoblang, uning tomonlari 8 cm va 6 cm.", "24", "5", "6", "27", "24"));
                break;
            }
            case FIZIKA: {
                questionData.add(new QuestionData("Mekanika: Qalqib yuradigan ob'ektning tezlanishini hisoblash uchun qaysi formuladan foydalaniladi?", "3", "5", "6", "7", "6"));
                questionData.add(new QuestionData("Isitish va termodinamika: Qay birikmali isitgich birikmali quvvatga o'zgartiradi?", "3", "5", "6", "7", "5"));
                questionData.add(new QuestionData("Optika: Kichiklardan katta to'g'ri burchakli stroboskopik effektga misol?", "3", "5", "6", "7", "6"));
                questionData.add(new QuestionData("Elektrika va magnetizm: Elektrik to'qimalarining bir-biriga ta'sirini qanday ifodalaydi?", "3", "40", "6", "7", "40"));
                questionData.add(new QuestionData("Atom fizikasi: Elektronning joylashishi va harakatlanishi to'g'ri keluvchi qaysi atom modeliga asoslangan?", "3", "40", "6", "7", "40"));
                questionData.add(new QuestionData("Mekanika: Bir ob'ektning tezlanishini hisoblash uchun qaysi formuladan foydalaniladi?", "3", "40", "6", "7", "40"));
                questionData.add(new QuestionData("Isitish va termodinamika: Isitish energiyasi qaysi birlarda ifodalangan?", "3", "40", "6", "7", "40"));
                questionData.add(new QuestionData("Optika: Qora tishni qora qilish uchun qaysi rang uchun joylashgan bitta tishdan foydalaniladi?", "3", "40", "6", "7", "40"));
                questionData.add(new QuestionData("Elektrika va magnetizm: Elektrik to'qimalarining bir-biriga ta'siri qanday ifodalaydi?", "3", "40", "6", "7", "40"));
                questionData.add(new QuestionData("Atom fizikasi: Elektronning joylashishi va harakatlanishi to'g'ri keluvchi qaysi atom modeliga asoslangan?", "3", "40", "6", "7", "40"));
                questionData.add(new QuestionData("Elektr qurilmalar: Elektr energiya uzatishida foydalaniladigan element qanday?", "3", "40", "6", "7", "40"));
                questionData.add(new QuestionData("Harorat va termodinamika: Harorat birikmali birikmali quvvatga o'zgartiradi.", "3", "40", "6", "7", "40"));
                questionData.add(new QuestionData("Optika: Quyoshning tezlanishi katta yuza harakati tufayli yuz beradi. Bu qaysi optik effekt?", "3", "40", "6", "7", "40"));
                questionData.add(new QuestionData("Atom fizikasi: Elektronning joylashishi va harakatlanishi to'g'ri keluvchi qaysi atom modeliga asoslangan?", "3", "40", "6", "7", "40"));
                questionData.add(new QuestionData("Elektromagnitizm: Bir elektr stantionida generatsiya qilinayotgan kuchli elektr energiya qanday transport qilinadi?", "3", "40", "6", "7", "40"));
                questionData.add(new QuestionData("Qalqib yuradigan ob'ektning tezlanishini hisoblash uchun qaysi formuladan foydalaniladi?", "3", "40", "6", "7", "40"));
                questionData.add(new QuestionData("Isitish va termodinamika: Isitish energiyasining birlari qaysi birlarda ifodalangan?", "3", "40", "6", "7", "40"));
                questionData.add(new QuestionData("Optika: Quyoshning tezlanishi katta yuza harakati tufayli yuz beradi. Bu qaysi optik effekt?", "3", "40", "6", "7", "40"));
                questionData.add(new QuestionData("Quyidagi tizimlardan qaysi biri kuchning SI o‘lchovi?", "Nyuton", "Vatt", "Joul", "Paskal", "Nyuton"));
                questionData.add(new QuestionData("Quyidagi qanday bir vektor miqdori?", "Tezlik", "Harorat", "Masofa", "Tezlik", "Tezlik"));
                questionData.add(new QuestionData("Yer yuzining gravitatsion tezlanishining aksariligi qancha (muqarrar)?", "9.8 m/s²", "10.2 m/s²", "8.2 m/s²", "11.5 m/s²", "9.8 m/s²"));
                questionData.add(new QuestionData("Harekat qonunlaridan qaysi biri har bir harakat uchun harakatning to‘g‘ri va barobar reaksiyasi borligini aytadi?", "Nyutonning Birinchi qonuni", "Nyutonning Ikkinchi qonuni", "Nyutonning Uchinchi qonuni", "Umumiy Gravitatsiya qonuni", "Nyutonning Uchinchi qonuni"));
                questionData.add(new QuestionData("Energiyaning SI o‘lchovi qanday?", "Nyuton", "Vatt", "Joul", "Paskal", "Joul"));
                questionData.add(new QuestionData("Quyidagi qaysi biri energiya turi emas?", "Kinematik energiya", "Potentsial energiya", "Harorat energiyasi", "Tezlik energiyasi", "Tezlik energiyasi"));
                questionData.add(new QuestionData("Ish qilishni hisoblash uchun formulani qanday?", "I = F/d", "I = F × t", "I = m × a", "I = P/V", "I = F/d"));
                questionData.add(new QuestionData("Kuchning SI o‘lchovi qanday?", "Nyuton", "Vatt", "Joul", "Paskal", "Vatt"));
                questionData.add(new QuestionData("Haroratning qonunlaridan qaysi biri energiyani yaratishning mumkin bo‘lmaganligini, faqat o‘zgarishsiz yoki o‘tkazilganligini aytadi?", "Birinchi qonun", "Ikkinchi qonun", "Uchinchi qonun", "Nolinch qonun", "Birinchi qonun"));
                questionData.add(new QuestionData("Kinematik energiyani hisoblash formulasi qanday?", "KE = 0.5 × m × v²", "KE = mgh", "KE = P/t", "KE = F × d", "KE = 0.5 × m × v²"));
                questionData.add(new QuestionData("Quyidagi qaysi biri tabiatning asosiy kuchlari?", "Sirtqa kuch", "Tenzion kuch", "Elektromagnit kuch", "Kontakt kuch", "Elektromagnit kuch"));
                questionData.add(new QuestionData("Elektr o‘lchovning SI o‘lchovi qanday?", "Volt", "Ampyer", "Om", "Kulon", "Kulon"));
                questionData.add(new QuestionData("Boshqarilish tufayli turli obyektlarning tezlanishi qancha?", "10 m/s²", "9.8 m/s²", "9.2 m/s²", "11 m/s²", "9.8 m/s²"));
                questionData.add(new QuestionData("Chegaraning SI o‘lchovi qanday?", "Volt", "Ampyer", "Om", "Kulon", "Ampyer"));
                questionData.add(new QuestionData("Harakatning qonunlaridan qaysi biri obyektning qolgan harakati bo‘lib qolishi yoki harakatdagi qolgan harakati bo‘lishi mumkin?", "Nyutonning Birinchi qonuni", "Nyutonning Ikkinchi qonuni", "Nyutonning Uchinchi qonuni", "Umumiy Gravitatsiya qonuni", "Nyutonning Birinchi qonuni"));
                questionData.add(new QuestionData("Omning qonuni formulasi qanday?", "V = IR", "V = I/R", "I = RV", "I = VR", "V = IR"));
                questionData.add(new QuestionData("Quyidagi qaysi biri elektromagnit maydon turi emas?", "Radio maydonlar", "X-ışonlar", "Tovush maydonlari", "Gamma zaryadlar", "Tovush maydonlari"));
                questionData.add(new QuestionData("Mushakning SI o‘lchovi qanday?", "Volt", "Ampyer", "Om", "Kulon", "Om"));
                questionData.add(new QuestionData("Harakatning qonunlaridan qaysi biri obyektni ta’sir qilgan narsa bo‘yicha to‘plam kuchi va uning massasi nisbatan to‘g‘ri bog‘langanligini aytadi?", "Nyutonning Birinchi qonuni", "Nyutonning Ikkinchi qonuni", "Nyutonning Uchinchi qonuni", "Umumiy Gravitatsiya qonuni", "Nyutonning Ikkinchi qonuni"));
                questionData.add(new QuestionData("Qo‘llanish potentsial energiyasini hisoblash formulasi qanday?", "GPE = m × g × h", "GPE = 0.5 × m × v²", "GPE = P/t", "GPE = F × d", "GPE = m × g × h"));
                questionData.add(new QuestionData("Quyidagi qaysi biri yadro bozorlanish turidir, unda atom qirg‘in atomini chiqaradi?", "Alfa bozorlanish", "Beta bozorlanish", "Gamma bozorlanish", "Neutron bozorlanish", "Alfa bozorlanish"));
                questionData.add(new QuestionData("Chegaraning SI o‘lchovi qanday?", "Volt", "Ampyer", "Om", "Kulon", "Ampyer"));


                questionData.add(new QuestionData("Elektrika va magnetizm: Elektrik to'qimalarining bir-biriga ta'sirini qanday ifodalaydi?", "3", "40", "6", "7", "40"));
                questionData.add(new QuestionData("Atom fizikasi: Elektronning joylashishi va harakatlanishi to'g'ri keluvchi qaysi atom modeliga asoslangan?", "3", "40", "6", "7", "40"));
                break;
            }


            case INGILIZ_TILI: {
                questionData.add(new QuestionData("What is the correct past tense form of the verb 'go'?", "Went", "Goed", "Gone", "Going", "Went"));
                questionData.add(new QuestionData("Which of the following is a modal verb?", "Can", "Run", "Jump", "Walk", "Can"));
                questionData.add(new QuestionData("What is the comparative form of 'good'?", "Better", "Best", "Gooder", "Goodest", "Better"));
                questionData.add(new QuestionData("Which of the following is a preposition?", "Under", "Run", "Jump", "With", "Under"));
                questionData.add(new QuestionData("What is the superlative form of 'far'?", "Farthest", "Farest", "Furthest", "Farther", "Farthest"));
                questionData.add(new QuestionData("Which of the following is a conjunction?", "And", "Jump", "Run", "Walk", "And"));
                questionData.add(new QuestionData("What is the past participle of the verb 'eat'?", "Eaten", "Eat", "Ate", "Eating", "Eaten"));
                questionData.add(new QuestionData("Which of the following is a determiner?", "The", "Go", "Run", "Jump", "The"));
                questionData.add(new QuestionData("What is the present continuous form of the verb 'read'?", "Reading", "Read", "Reads", "Will read", "Reading"));
                questionData.add(new QuestionData("Which of the following is a gerund?", "Running", "Run", "Jump", "Walk", "Running"));
                questionData.add(new QuestionData("What is the plural form of 'child'?", "Children", "Childs", "Childes", "Childers", "Children"));
                questionData.add(new QuestionData("Which of the following is a past perfect tense sentence?", "She had finished her homework before dinner.", "She finishes her homework before dinner.", "She will finish her homework before dinner.", "She is finishing her homework before dinner.", "She had finished her homework before dinner."));
                questionData.add(new QuestionData("What is the correct comparative form of 'big'?", "Bigger", "Biggest", "Biger", "Biggest", "Bigger"));
                questionData.add(new QuestionData("Which of the following is a present perfect tense sentence?", "They have lived here for five years.", "They lived here for five years.", "They will live here for five years.", "They live here for five years.", "They have lived here for five years."));
                questionData.add(new QuestionData("What is the plural form of 'knife'?", "Knives", "Knifes", "Knive", "Knifer", "Knives"));
                questionData.add(new QuestionData("Which of the following is a past continuous tense sentence?", "She was sleeping when the phone rang.", "She sleeps when the phone rings.", "She is sleeping when the phone rings.", "She will sleep when the phone rings.", "She was sleeping when the phone rang."));
                questionData.add(new QuestionData("What is the comparative form of 'bad'?", "Worse", "Baddest", "Baddest", "Worst", "Worse"));
                questionData.add(new QuestionData("Which of the following is a present perfect continuous tense sentence?", "He has been studying all night.", "He studies all night.", "He will study all night.", "He is studying all night.", "He has been studying all night."));
                questionData.add(new QuestionData("What is the past tense form of 'take'?", "Took", "Taken", "Taked", "Taked", "Took"));
                questionData.add(new QuestionData("Which of the following is a past perfect continuous tense sentence?", "She had been waiting for an hour before he arrived.", "She waits for an hour before he arrived.", "She will wait for an hour before he arrives.", "She is waiting for an hour before he arrives.", "She had been waiting for an hour before he arrived."));
                questionData.add(new QuestionData("What is the comparative form of 'interesting'?", "More interesting", "Most interesting", "Interestinger", "Interest", "More interesting"));
                questionData.add(new QuestionData("Which of the following is a present continuous tense sentence?", "She is reading a book.", "She read a book.", "She will read a book.", "She has read a book.", "She is reading a book."));
                questionData.add(new QuestionData("What is the past participle of 'swim'?", "Swum", "Swam", "Swiming", "Swimming", "Swum"));
                questionData.add(new QuestionData("Which of the following is a present perfect continuous tense sentence?", "They have been working hard all day.", "They worked hard all day.", "They will work hard all day.", "They work hard all day.", "They have been working hard all day."));
                questionData.add(new QuestionData("What is the superlative form of 'beautiful'?", "Most beautiful", "More beautiful", "Beautifullest", "Beautifuler", "Most beautiful"));
                questionData.add(new QuestionData("Which of the following is a past perfect continuous tense sentence?", "They had been playing tennis for two hours before it started raining.", "They play tennis for two hours before it starts raining.", "They will play tennis for two hours before it starts raining.", "They are playing tennis for two hours before it starts raining.", "They had been playing tennis for two hours before it started raining."));
                questionData.add(new QuestionData("What is the plural form of 'mouse'?", "Mice", "Mouses", "Micees", "Mouse", "Mice"));
                questionData.add(new QuestionData("Which of the following is a present continuous tense sentence?", "She is cooking dinner.", "She cooked dinner.", "She will cook dinner.", "She has cooked dinner.", "She is cooking dinner."));
                questionData.add(new QuestionData("What is the past tense form of 'sing'?", "Sang", "Sung", "Sing", "Singed", "Sang"));
                questionData.add(new QuestionData("Which of the following is a past continuous tense sentence?", "He was sleeping when the doorbell rang.", "He sleeps when the doorbell rings.", "He is sleeping when the doorbell rings.", "He will sleep when the doorbell rings.", "He was sleeping when the doorbell rang."));
                questionData.add(new QuestionData("What is the superlative form of 'fast'?", "Fastest", "Faster", "Fastestest", "Fast", "Fastest"));
                questionData.add(new QuestionData("Which of the following is a present perfect tense sentence?", "She has finished her homework.", "She finishes her homework.", "She will finish her homework.", "She is finishing her homework.", "She has finished her homework."));
                questionData.add(new QuestionData("What is the past participle of 'run'?", "Run", "Ran", "Runned", "Running", "Run"));
                break;
            }

            case Bialogiya: {
                questionData.add(new QuestionData("Fotosintezning asosiy muddati qaysi?", "Nurli faoliyat", "Oxigen ichkari", "Glikoz biosintez", "Karbon dioksida qabul qilish", "Nurli faoliyat"));
                questionData.add(new QuestionData("Qog'ozosm tayanchlar qaysi turlarga mansub?", "Prokaryotlar", "Eukaryotlar", "Arxeyler", "Protistar", "Prokaryotlar"));
                questionData.add(new QuestionData("O'tkir hayotiy modellar batareya to'g'risidagi asosiy muddatlar qaysilardan iborat?", "Fotosintez va respiratsiya", "Asos va amilasuzlar", "Respiratsiya va fotosintez", "Niyam va soliq", "Fotosintez va respiratsiya"));
                questionData.add(new QuestionData("Oksigen qayerda ishlatiladi?", "Hidroliz reaksiyalari", "Yon reaksiyalari", "Oksidlash reaksiyalari", "Yonlanish reaksiyalari", "Yonlanish reaksiyalari"));
                questionData.add(new QuestionData("Yadroli g’oyalar qaysi turlarga mansub?", "Protistarlar", "Griblar", "Arxeyler", "Fungilar", "Fungilar"));
                questionData.add(new QuestionData("Nima uchun genomning nisbati hayajonlarda o'zgarishi muhimdir?", "Genning ekspresiya darajasi", "Proteinlar soni", "DNK uzunligi", "Amino asitlar soni", "Genning ekspresiya darajasi"));
                questionData.add(new QuestionData("Qog'ozosm tayanchlar qaysi faoliyatni bajaradilar?", "Fotosintez", "Respiratsiya", "Xloroplastlarni yaratish", "Qurilmalarning o'sishini ta'minlash", "Fotosintez"));
                questionData.add(new QuestionData("Oxigendan foydalanuvchi hayvanlar qaysi organnlardan oksigeni qabul qiladi?", "Bronxi", "Kapillyarlar", "Alveollar", "Trakhea", "Alveollar"));
                questionData.add(new QuestionData("Fotosintez reaksiyasida qanday bir madda chiqadi?", "Karbon dioksida", "Oksigen", "Sukroz", "Gliserin", "Oksigen"));
                questionData.add(new QuestionData("Yonalish organellalari sifatida funksiya ko'rsatuvchi qaysi qism?", "Plazmoli membrana", "Kislota kapsula", "Yadro", "Mitokhondriya", "Plazmoli membrana"));
                questionData.add(new QuestionData("Ribosomlar qaysi funksiyani bajaradilar?", "Protein sintezi", "Yağ sintezi", "Glikogen sintezi", "Ribozomlar sintezi", "Protein sintezi"));
                questionData.add(new QuestionData("Qog'ozosm tayanchlar qaysi faoliyatni bajaradilar?", "Fotosintez", "Respiratsiya", "Biosintez", "O'lchash", "Fotosintez"));
                questionData.add(new QuestionData("Qaysi tuzaklar hayvonlar uchun faol rivojlanib kelayotgan turkumlarning ko'nikmalari?", "Kapsula", "Glikokaliks", "Plazmoli membrana", "Ribozomlar", "Plazmoli membrana"));
                questionData.add(new QuestionData("Ribosomlar qaysi organnlarda joylashgan?", "Mitokhondriya", "Endoplasmatik retikulum", "Kislota kapsula", "Hromosom", "Endoplasmatik retikulum"));
                questionData.add(new QuestionData("Oxigen yonlanish reaksiyasi qaysi qismda sodir bo'ladi?", "Qog'ozosm tayanchlar", "Mitokhondriya", "Kislota kapsula", "Endoplasmatik retikulum", "Mitokhondriya"));
                questionData.add(new QuestionData("Kishisida oksigen ta'minoti qanday bo'lishi mumkin?", "Derma orqali", "Tizim yonida", "Tizim vasitasida", "Kichik kislota orqali", "Tizim yonida"));
                questionData.add(new QuestionData("Oxigen nima uchun hayvonlarga kerak?", "Hidroliz reaksiyalari uchun", "Respiratsiya uchun", "Fotosintez uchun", "Xloroplastlar uchun", "Respiratsiya uchun"));
                questionData.add(new QuestionData("Qaysi organ orqali oksigeni ta'minlash mumkin?", "Buxanka orqali", "Qon yonida", "Qon to'qimalari orqali", "Alveollar orqali", "Alveollar orqali"));
                questionData.add(new QuestionData("Fotosintez reaksiyasida qanday bir narsa ishlatiladi?", "Karbon dioksida", "Sukroz", "Oksigen", "Kislorod", "Karbon dioksida"));
                questionData.add(new QuestionData("Qanday hayvanlar fotosintez qila oladilar?", "Har xil", "Hamma", "Agar aroqqa qoyilsa", "Hech qaysi", "Hech qaysi"));
                questionData.add(new QuestionData("Klonlash reaksiyasi qaysi jarayon bo'yicha sodir bo'ladi?", "Mitos", "Bakteriyal translyasiya", "Fotosintez", "Respiratsiya", "Mitos"));
                questionData.add(new QuestionData("Qog'ozosm tayanchlar qaysi funksiya bajaradi?", "Membranalar yaratish", "Metabolizmni o'tkazish", "Respiratsiya", "Bakteriyal qamrovchi", "Respiratsiya"));

                break;
            }
            case Kimyo: {
                questionData.add(new QuestionData("Protonlar, neytronlar va elektronlar qaysi atomlar ichida joylashadi?", "Protonlar va neytronlar atomning markazi yoki yadroda, elektronlar esa atomning xaritasida", "Protonlar va elektronlar atomning markazi yoki yadroda, neytronlar esa atomning xaritasida", "Elektronlar va neytronlar atomning markazi yoki yadroda, protonlar esa atomning xaritasida", "Protonlar va neytronlar atomning xaritasida, elektronlar esa atomning markazi yoki yadroda", "Protonlar va neytronlar atomning markazi yoki yadroda, elektronlar esa atomning xaritasida"));
                questionData.add(new QuestionData("Kimyoviy elementlar nechta kichik qurilmalardan tashkil topgan?", "118", "92", "110", "108", "118"));
                questionData.add(new QuestionData("Periodik jadvalda elementlar qaysi tartibda joylashadi?", "O‘simlik, hayvon va mineral", "Metallar, nemetallar va gazlar", "O‘simlik, mineral va metallar", "Hayvon, mineral va metallar", "Metallar, nemetallar va gazlar"));
                questionData.add(new QuestionData("Kimyoviy bog‘lanish qaysi reaksiyada sodir bo‘ladi?", "Ikki yoki undan ortiq atomning birlashishi", "Yaqinlashishi", "Biror birning qiymatini o‘zgartirishi", "Atomning yadro kuchi o‘zgarishi", "Ikki yoki undan ortiq atomning birlashishi"));
                questionData.add(new QuestionData("Kimyoviy formulada O ni nima ifodalaydi?", "Oq", "Oxygen", "Oy", "Ol", "Oxygen"));
                questionData.add(new QuestionData("Atomlar qaysi tarkibiy birliklar?", "Neitronlar", "Protonlar", "Kvantlar", "Molekulalar", "Protonlar"));
                questionData.add(new QuestionData("Periodik jadval qaysi xususiyatlar bo‘yicha tartiblangan?", "Atomning o‘lchamiga ko‘ra", "Atom yadroning o‘lchamiga ko‘ra", "Atom massasiga ko‘ra", "Atomning elektr charchagiga ko‘ra", "Atomning elektr charchagiga ko‘ra"));
                questionData.add(new QuestionData("Kimyoviy elementlar nechta guruhda joylashgan?", "18", "20", "16", "14", "18"));
                questionData.add(new QuestionData("Kimyoviy tuzlarning ichida qaysi nisbat orqali atomlar joylashadi?", "Proton va neytronlar", "Proton va elektronlar", "Elektron va neytronlar", "Proton, elektron va neytronlar", "Proton va elektronlar"));
                questionData.add(new QuestionData("Kimyoviy reaksiyada sababiylar qanday nomlanadi?", "Birlashishgan kimyoviy elementlar", "Yangi kimyoviy tuzlar", "Elektronlar", "Tuzlar", "Birlashishgan kimyoviy elementlar"));
                questionData.add(new QuestionData("Havo qanday elementlardan tashkil topgan?", "Azot va kislorod", "Azot va heliy", "Karbon va azot", "Karbon va kislorod", "Azot va kislorod"));
                questionData.add(new QuestionData("Kimyoviy reaksiyalar qanday shakllarda sodir bo‘ladi?", "Sekin va tez", "Sekin va yaxshi", "Tez va yaxshi", "Sekin va qarshilik", "Tez va yaxshi"));
                questionData.add(new QuestionData("Mendeleev kimyoviy elementlarni qaysi tartibda joylagan?", "Atom massasiga ko‘ra", "O‘lchami bo‘yicha", "Elektronlar soniga ko‘ra", "Yadro kuchiga ko‘ra", "Atom massasiga ko‘ra"));
                questionData.add(new QuestionData("Atom o‘lchami qanday o‘lchaydi?", "Angstrom", "Nano", "Micron", "Meter", "Angstrom"));
                questionData.add(new QuestionData("Kimyoviy formulada S ni nima ifodalaydi?", "Seri", "Silicon", "Siriq", "Sera", "Silicon"));

                break;
            }
        }
    }
}
