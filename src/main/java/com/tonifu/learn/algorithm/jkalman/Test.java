package com.tonifu.learn.algorithm.jkalman;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.tonifu.learn.algorithm.jkalman.jama.Matrix;

import java.util.ArrayList;
import java.util.List;
/**
 * @Author fuj
 * @Date 2022-11-03 11:11
 * @PackageName:com.tonifu.learn.algorithm.jkalman
 * @ClassName: Test
 * @Description: TODO
 * @Version 1.0
 */
public class Test {


/**
 * @author Tiger-l
 * 2022-08-09 19:49:27
 */
    public static void main(String[] args) throws Exception {
//        List<Float> stream=new ArrayList<>();
//        stream.add(2.1f);
//        stream.add(2.2f);
//        stream.add(2.3f);
//        stream.add(2.5f);
//        stream.add(2.8f);
//        stream.add(2.9f);
//        stream.add(3.1f);
//        stream.add(3.2f);
//        stream.add(3.4f);
//        stream.add(3.7f);
//        System.out.println("前"+stream);
//        List<Float> from1D = createFrom1D(stream);
//        System.out.println("后"+from1D);


//        List<float[]> stream=new ArrayList<>();
//        stream.add(new float[]{2.1f,1.1f});
//        stream.add(new float[]{2.2f,1.2f});
//        stream.add(new float[]{2.3f,1.3f});
//        stream.add(new float[]{2.5f,1.4f});
//        stream.add(new float[]{2.8f,1.7f});
//        stream.add(new float[]{2.9f,1.9f});
//        stream.add(new float[]{3.1f,2.1f});
//        stream.add(new float[]{3.2f,2.4f});
//        stream.add(new float[]{3.4f,2.5f});
//        stream.add(new float[]{3.7f,2.8f});
//        for (float[] floats : stream) {
//            System.out.print("["+ floats[0]+"-"+floats[1]+"]");
//        }
//        List<float[]> from1D = createFrom2D(stream);
//        System.out.println();
//        for (float[] floats : from1D) {
//            System.out.print("["+ floats[0]+"-"+floats[1]+"]");
//        }


//        List<float[]> stream=new ArrayList<>();
//        stream.add(new float[]{2.1f,1.1f,0.1f});
//        stream.add(new float[]{2.2f,1.2f,0.2f});
//        stream.add(new float[]{2.3f,1.3f,0.3f});
//        stream.add(new float[]{2.5f,1.4f,0.4f});
//        stream.add(new float[]{2.8f,1.7f,0.7f});
//        stream.add(new float[]{2.9f,1.9f,0.9f});
//        stream.add(new float[]{3.1f,2.1f,1.1f});
//        stream.add(new float[]{3.2f,2.4f,1.4f});
//        stream.add(new float[]{3.4f,2.5f,1.5f});
//        stream.add(new float[]{3.7f,2.8f,1.8f});
//        for (float[] floats : stream) {
//            System.out.print("["+ floats[0]+"-"+floats[1]+"-"+floats[2]+"]");
//        }
//        List<float[]> from1D = createFrom3D(stream);
//        System.out.println();
//        for (float[] floats : from1D) {
//            System.out.print("["+ floats[0]+"-"+floats[1]+"-"+floats[2]+"]");
//        }


        /*List<float[]> stream=new ArrayList<>();
        stream.add(new float[]{2.1f,1.1f,0.1f});
        stream.add(new float[]{2.2f,1.2f,0.2f});
        stream.add(new float[]{2.3f,1.3f,0.3f});
        stream.add(new float[]{2.5f,1.4f,0.4f});
        stream.add(new float[]{2.8f,1.7f,0.7f});
        stream.add(new float[]{2.9f,1.9f,0.9f});
        stream.add(new float[]{3.1f,2.1f,1.1f});
        stream.add(new float[]{3.2f,2.4f,1.4f});
        stream.add(new float[]{3.4f,2.5f,1.5f});
        stream.add(new float[]{3.7f,2.8f,1.8f});
        for (float[] floats : stream) {
            System.out.print("["+ floats[0]+"-"+floats[1]+"-"+floats[2]+"]");
        }
        List<float[]> from1D = createLowPassFilter(stream);
        System.out.println();
        for (float[] floats : from1D) {
            System.out.print("["+ floats[0]+"-"+floats[1]+"-"+floats[2]+"]");
        }*/
        String json="[{\"latitude\":29.162892872514696,\"longitude\":120.80536948515322},{\"latitude\":29.16286954166768,\"longitude\":120.80540115431768},{\"latitude\":29.162827876274918,\"longitude\":120.80540782187776},{\"latitude\":29.16283454259405,\"longitude\":120.80540448823957},{\"latitude\":29.16285287491866,\"longitude\":120.8053944873415},{\"latitude\":29.162864540606712,\"longitude\":120.80538281972397},{\"latitude\":29.162852874601448,\"longitude\":120.80538948698413},{\"latitude\":29.16282787437172,\"longitude\":120.80537781973355},{\"latitude\":29.162732877052743,\"longitude\":120.80538948818567},{\"latitude\":29.162712875132794,\"longitude\":120.8053528190959},{\"latitude\":29.16270787777487,\"longitude\":120.80539282200759},{\"latitude\":29.16269954450601,\"longitude\":120.80539115530522},{\"latitude\":29.162742881598927,\"longitude\":120.80546449343743},{\"latitude\":29.162729549801917,\"longitude\":120.80548449499494},{\"latitude\":29.162711216105876,\"longitude\":120.80547282768133},{\"latitude\":29.162711214735765,\"longitude\":120.80545115947109},{\"latitude\":29.16272121537482,\"longitude\":120.80546449365437},{\"latitude\":29.16265455049128,\"longitude\":120.80547116146337},{\"latitude\":29.162642888375288,\"longitude\":120.80553949977175},{\"latitude\":29.16266622091698,\"longitude\":120.80553449918318},{\"latitude\":29.162602890137013,\"longitude\":120.80555450123657},{\"latitude\":29.162587890443355,\"longitude\":120.80555450138675},{\"latitude\":29.162597890239123,\"longitude\":120.80555450128662},{\"latitude\":29.16258622454509,\"longitude\":120.80556616889741},{\"latitude\":29.162504561013733,\"longitude\":120.80558950470164},{\"latitude\":29.162442896130035,\"longitude\":120.80559783924238},{\"latitude\":29.162357901839236,\"longitude\":120.80566117790303},{\"latitude\":29.16228457365257,\"longitude\":120.8057195160816},{\"latitude\":29.162217910531744,\"longitude\":120.80575451921014},{\"latitude\":29.16221124452084,\"longitude\":120.80576285319559},{\"latitude\":29.162191245760155,\"longitude\":120.80577618766524},{\"latitude\":29.162154581917274,\"longitude\":120.80580952370336},{\"latitude\":29.162149581085853,\"longitude\":120.80579452270189},{\"latitude\":29.162167914356186,\"longitude\":120.80579952286897},{\"latitude\":29.162199579027224,\"longitude\":120.80577785436549},{\"latitude\":29.16221291188067,\"longitude\":120.80577452066471},{\"latitude\":29.162246243390616,\"longitude\":120.80575618571024},{\"latitude\":29.162356237918587,\"longitude\":120.80570451430806},{\"latitude\":29.16245956736941,\"longitude\":120.80567617794343},{\"latitude\":29.162541229652778,\"longitude\":120.80563284073332},{\"latitude\":29.16256622778235,\"longitude\":120.80561117228443},{\"latitude\":29.16253789198905,\"longitude\":120.80556283581167},{\"latitude\":29.16265788754376,\"longitude\":120.80553116569659},{\"latitude\":29.162704547677937,\"longitude\":120.80544282561041},{\"latitude\":29.162691208060963,\"longitude\":120.80533948502446},{\"latitude\":29.162714547579164,\"longitude\":120.80544449229582},{\"latitude\":29.162256168747433,\"longitude\":120.8045944350727},{\"latitude\":29.162074506446608,\"longitude\":120.80460443763293},{\"latitude\":29.16197783933971,\"longitude\":120.80456776921474},{\"latitude\":29.16187617134076,\"longitude\":120.8045160997266},{\"latitude\":29.16178783694634,\"longitude\":120.8044727640507},{\"latitude\":29.16165450379553,\"longitude\":120.80443442919245},{\"latitude\":29.161539499944823,\"longitude\":120.804341090027},{\"latitude\":29.161384496327294,\"longitude\":120.80423941727229},{\"latitude\":29.161261161270826,\"longitude\":120.80417608039711},{\"latitude\":29.16116282558061,\"longitude\":120.80411107646546},{\"latitude\":29.161046156244193,\"longitude\":120.80403607194364},{\"latitude\":29.160897819177993,\"longitude\":120.80393606581329},{\"latitude\":29.16073614777335,\"longitude\":120.80381772504418},{\"latitude\":29.160559476632923,\"longitude\":120.80369938437902},{\"latitude\":29.160389471981937,\"longitude\":120.80358104360089},{\"latitude\":29.16020446759506,\"longitude\":120.80346270292674},{\"latitude\":29.160041129855088,\"longitude\":120.80335102917796},{\"latitude\":29.159859459118195,\"longitude\":120.80323935557168},{\"latitude\":29.159701120151784,\"longitude\":120.80311268050579},{\"latitude\":29.159519448514704,\"longitude\":120.80298933921891},{\"latitude\":29.159352781124202,\"longitude\":120.80293100291459},{\"latitude\":29.159214452251746,\"longitude\":120.80295433948962},{\"latitude\":29.15909279428051,\"longitude\":120.80304268105473},{\"latitude\":29.159066131550542,\"longitude\":120.80309101848196},{\"latitude\":29.158961138706346,\"longitude\":120.80316269185992},{\"latitude\":29.158801150216867,\"longitude\":120.80328103610387},{\"latitude\":29.15861782882722,\"longitude\":120.80339938053514},{\"latitude\":29.158477836514212,\"longitude\":120.80346938739405},{\"latitude\":29.158461174554578,\"longitude\":120.80353272581839},{\"latitude\":29.158409505375065,\"longitude\":120.80348105565258},{\"latitude\":29.158312845153535,\"longitude\":120.803546061671},{\"latitude\":29.158176186418554,\"longitude\":120.80362106884935},{\"latitude\":29.158097863800805,\"longitude\":120.80375441325113},{\"latitude\":29.15806620639766,\"longitude\":120.80388108995062},{\"latitude\":29.158029546797696,\"longitude\":120.80397443077602},{\"latitude\":29.158031215344646,\"longitude\":120.80400276624998},{\"latitude\":29.15809288334471,\"longitude\":120.80404110188083},{\"latitude\":29.15812955151176,\"longitude\":120.80407443737772},{\"latitude\":29.158154552237384,\"longitude\":120.80409277185106},{\"latitude\":29.158147886602613,\"longitude\":120.80410610626143},{\"latitude\":29.158127885664005,\"longitude\":120.80408610494582},{\"latitude\":29.158074553077657,\"longitude\":120.8040811051003},{\"latitude\":29.15802955365523,\"longitude\":120.8040761051713},{\"latitude\":29.157996220213533,\"longitude\":120.80406443795296},{\"latitude\":29.157981220518188,\"longitude\":120.80406443810304},{\"latitude\":29.158072883076773,\"longitude\":120.80403110132112},{\"latitude\":29.158101218305195,\"longitude\":120.80406777048876},{\"latitude\":29.158126218246142,\"longitude\":120.80407443741106},{\"latitude\":29.158114554282463,\"longitude\":120.80411110697362},{\"latitude\":29.158082885680873,\"longitude\":120.80407277105152},{\"latitude\":29.158019552960706,\"longitude\":120.80406277092634},{\"latitude\":29.157989552110283,\"longitude\":120.80404110291467},{\"latitude\":29.157971219149307,\"longitude\":120.80404110309809},{\"latitude\":29.158011215638343,\"longitude\":120.80400109965657},{\"latitude\":29.15806287945396,\"longitude\":120.80397443044254},{\"latitude\":29.158151214031943,\"longitude\":120.80401943298382},{\"latitude\":29.158161219777103,\"longitude\":120.80410777292093},{\"latitude\":29.15815288381009,\"longitude\":120.80406610317867},{\"latitude\":29.158202876384635,\"longitude\":120.8039710954545},{\"latitude\":29.15817619338052,\"longitude\":120.80372274336338},{\"latitude\":29.158182857062123,\"longitude\":120.803681073418},{\"latitude\":29.158194527935002,\"longitude\":120.80374607830952},{\"latitude\":29.158122872704876,\"longitude\":120.80389275694256},{\"latitude\":29.158174536398757,\"longitude\":120.80386442092464},{\"latitude\":29.158036203042947,\"longitude\":120.80382275244953},{\"latitude\":29.15793453435352,\"longitude\":120.80376274885946},{\"latitude\":29.15808120122144,\"longitude\":120.80380941764317},{\"latitude\":29.158037875900572,\"longitude\":120.80391442611545},{\"latitude\":29.15807622015899,\"longitude\":120.80408777225576},{\"latitude\":29.1581512217715,\"longitude\":120.80413444170637},{\"latitude\":29.15817455519016,\"longitude\":120.80414277543662},{\"latitude\":29.15809455211055,\"longitude\":120.80407277093481},{\"latitude\":29.157911223734494,\"longitude\":120.80409110749254},{\"latitude\":29.157929553216533,\"longitude\":120.80403943672167},{\"latitude\":29.157991211649517,\"longitude\":120.80393609490326},{\"latitude\":29.158086213664728,\"longitude\":120.80399443173216},{\"latitude\":29.15802454001163,\"longitude\":120.80387275639657},{\"latitude\":29.15800787458849,\"longitude\":120.80388609091666},{\"latitude\":29.157932877355293,\"longitude\":120.80390442640196},{\"latitude\":29.157971222740102,\"longitude\":120.80409444047827},{\"latitude\":29.157999553030187,\"longitude\":120.80405777074694},{\"latitude\":29.158036218727563,\"longitude\":120.80405443679373},{\"latitude\":29.15801955329738,\"longitude\":120.80406777130581},{\"latitude\":29.158106219997986,\"longitude\":120.80409443912762},{\"latitude\":29.158127884878947,\"longitude\":120.80407443739439},{\"latitude\":29.15809454964046,\"longitude\":120.8040361014843},{\"latitude\":29.15802789474299,\"longitude\":120.80419111388888},{\"latitude\":29.157966226983174,\"longitude\":120.80415611186234},{\"latitude\":29.158032892295775,\"longitude\":120.80415611119538},{\"latitude\":29.157964551494224,\"longitude\":120.80402443523158},{\"latitude\":29.158062902269233,\"longitude\":120.80431445615478},{\"latitude\":29.158049565205005,\"longitude\":120.80425445177855},{\"latitude\":29.158064560441634,\"longitude\":120.80418777993715},{\"latitude\":29.158051225480268,\"longitude\":120.80415944459725},{\"latitude\":29.15805622000456,\"longitude\":120.80407943849063},{\"latitude\":29.15807955028222,\"longitude\":120.80404110201424},{\"latitude\":29.158081215453908,\"longitude\":120.80401943368418},{\"latitude\":29.158037885360375,\"longitude\":120.80405443677705},{\"latitude\":29.158264529241062,\"longitude\":120.80378608068416},{\"latitude\":29.158254541776238,\"longitude\":120.8039677613502},{\"latitude\":29.15816954395383,\"longitude\":120.80397442937532},{\"latitude\":29.158157887855115,\"longitude\":120.80412777446855},{\"latitude\":29.158134554883866,\"longitude\":120.80412610790918},{\"latitude\":29.157966228993956,\"longitude\":120.80418611412844},{\"latitude\":29.157971226098944,\"longitude\":120.80414444426363},{\"latitude\":29.15808288332314,\"longitude\":120.80403776839432},{\"latitude\":29.158076217578206,\"longitude\":120.80404943601386},{\"latitude\":29.15818453086635,\"longitude\":120.8037860814846},{\"latitude\":29.158211195855092,\"longitude\":120.80376941327049},{\"latitude\":29.158054559192898,\"longitude\":120.80416611173433},{\"latitude\":29.157942883692893,\"longitude\":120.80400110034024},{\"latitude\":29.157934550866372,\"longitude\":120.80400610080407},{\"latitude\":29.15803290409926,\"longitude\":120.80433279116379},{\"latitude\":29.15796957703567,\"longitude\":120.80440779741303},{\"latitude\":29.157899567694955,\"longitude\":120.80424611931858},{\"latitude\":29.158022899636414,\"longitude\":120.80426278600572},{\"latitude\":29.157882891312834,\"longitude\":120.80409610815497},{\"latitude\":29.157926224774464,\"longitude\":120.80411110885784},{\"latitude\":29.158089552212115,\"longitude\":120.80407277098483},{\"latitude\":29.158171195075695,\"longitude\":120.80374607854299},{\"latitude\":29.157942896915795,\"longitude\":120.80419778190898},{\"latitude\":29.158241206006736,\"longitude\":120.80392775843258},{\"latitude\":29.15800456032021,\"longitude\":120.80416777902714},{\"latitude\":29.15800956679642,\"longitude\":120.80426611972321},{\"latitude\":29.157862874023547,\"longitude\":120.80383442174487},{\"latitude\":29.15803289631472,\"longitude\":120.80421611572457},{\"latitude\":29.158062870528187,\"longitude\":120.80384275371586},{\"latitude\":29.158289544554854,\"longitude\":120.80401943159976},{\"latitude\":29.158094542206694,\"longitude\":120.80392609310613},{\"latitude\":29.15822287969239,\"longitude\":120.8040260994403},{\"latitude\":29.158311216169405,\"longitude\":120.8040994374555},{\"latitude\":29.158126227083073,\"longitude\":120.80420611403679},{\"latitude\":29.15809622903038,\"longitude\":120.80422611584467},{\"latitude\":29.158081233675183,\"longitude\":120.80429112088571},{\"latitude\":29.15806620039107,\"longitude\":120.80379274984722},{\"latitude\":29.15816955058699,\"longitude\":120.80407277018443},{\"latitude\":29.1580195454227,\"longitude\":120.80395109576412},{\"latitude\":29.158001209526766,\"longitude\":120.80390775930631},{\"latitude\":29.1579462375281,\"longitude\":120.80430779015482},{\"latitude\":29.158029559812434,\"longitude\":120.80416777877701},{\"latitude\":29.158012896274915,\"longitude\":120.80420944875534},{\"latitude\":29.157927908891725,\"longitude\":120.80437279521158},{\"latitude\":29.158081227662528,\"longitude\":120.80420111410984},{\"latitude\":29.15815455660276,\"longitude\":120.80415777677081},{\"latitude\":29.158201216834694,\"longitude\":120.8040761034538},{\"latitude\":29.158034573613346,\"longitude\":120.80437612772734},{\"latitude\":29.157967910623952,\"longitude\":120.8044111310122},{\"latitude\":29.15790791824035,\"longitude\":120.80450780548838},{\"latitude\":29.15838789199849,\"longitude\":120.80425944876986},{\"latitude\":29.158606210398492,\"longitude\":120.80410276808975},{\"latitude\":29.158287855499232,\"longitude\":120.80368940634358},{\"latitude\":29.15828784703777,\"longitude\":120.80356606347254},{\"latitude\":29.15854952821283,\"longitude\":120.80385608320108},{\"latitude\":29.158611193399633,\"longitude\":120.80385274899541},{\"latitude\":29.15784455134339,\"longitude\":120.80398610018219},{\"latitude\":29.157746221807525,\"longitude\":120.80401276986206},{\"latitude\":29.157641224614128,\"longitude\":120.8040227716729},{\"latitude\":29.157869557577673,\"longitude\":120.80408610753035},{\"latitude\":29.15790787797602,\"longitude\":120.80390609344609},{\"latitude\":29.15800292727738,\"longitude\":120.80467448356158},{\"latitude\":29.158161238481743,\"longitude\":120.80438779399987},{\"latitude\":29.15807622262356,\"longitude\":120.8041244417},{\"latitude\":29.158129569135053,\"longitude\":120.80433779057167},{\"latitude\":29.15807789093452,\"longitude\":120.80414944357454},{\"latitude\":29.159064564808244,\"longitude\":120.80455946442324},{\"latitude\":29.15934957539233,\"longitude\":120.80480948002963},{\"latitude\":29.159532914520444,\"longitude\":120.8049561555937},{\"latitude\":29.159426245486046,\"longitude\":120.80488615154796},{\"latitude\":29.158856230210205,\"longitude\":120.80447612697559},{\"latitude\":29.15848121103313,\"longitude\":120.80407443385917},{\"latitude\":29.158486208910983,\"longitude\":120.80404443153195},{\"latitude\":29.157571196988084,\"longitude\":120.80359607296761},{\"latitude\":29.157567863951396,\"longitude\":120.80359940659238},{\"latitude\":29.158359545604405,\"longitude\":120.80405610035191},{\"latitude\":29.158479547314254,\"longitude\":120.8041177704932},{\"latitude\":29.158512882543302,\"longitude\":120.80415610639294},{\"latitude\":29.15811787585615,\"longitude\":120.8039377604298},{\"latitude\":29.158172873271216,\"longitude\":120.80391609155872},{\"latitude\":29.158347868585835,\"longitude\":120.80389942186763},{\"latitude\":29.158441203860896,\"longitude\":120.8039560919265},{\"latitude\":29.20394002324308,\"longitude\":120.78389681922859},{\"latitude\":29.15854452989899,\"longitude\":120.80387941837041},{\"latitude\":29.158347885560957,\"longitude\":120.80415110766587},{\"latitude\":29.157681181649796,\"longitude\":120.80340605709469},{\"latitude\":29.157714517650042,\"longitude\":120.8034543938637},{\"latitude\":29.157789530347905,\"longitude\":120.80366107580964},{\"latitude\":29.1583661939556,\"longitude\":120.80378774646157},{\"latitude\":29.158164523416556,\"longitude\":120.80367107282972},{\"latitude\":29.15799285543611,\"longitude\":120.803601069136},{\"latitude\":29.158051189643842,\"longitude\":120.80363107087346},{\"latitude\":29.158556140514964,\"longitude\":120.80307102200346},{\"latitude\":29.158427806275153,\"longitude\":120.8030210193254},{\"latitude\":29.158606204786302,\"longitude\":120.80401942843129},{\"latitude\":29.15872119229582,\"longitude\":120.80386941583741},{\"latitude\":29.158359541444934,\"longitude\":120.8039944289974},{\"latitude\":29.158359544818328,\"longitude\":120.80404443279933},{\"latitude\":29.158182878255122,\"longitude\":120.80399276397146},{\"latitude\":29.158076214318065,\"longitude\":120.80400109900627},{\"latitude\":29.158046212336977,\"longitude\":120.80396276305352},{\"latitude\":29.1580195439559,\"longitude\":120.80392942744429},{\"latitude\":29.158319546529434,\"longitude\":120.80405776754533},{\"latitude\":29.158322887521734,\"longitude\":120.80417277621996},{\"latitude\":29.15829791756494,\"longitude\":120.80461780975274},{\"latitude\":29.158674650835653,\"longitude\":120.80577788964077},{\"latitude\":29.157972897421892,\"longitude\":120.80421444953254},{\"latitude\":29.15791123423603,\"longitude\":120.80424778599402},{\"latitude\":29.157237797648417,\"longitude\":120.80255932759444},{\"latitude\":29.156707741850493,\"longitude\":120.80164759118087},{\"latitude\":29.158249518833845,\"longitude\":120.80362940209343},{\"latitude\":29.158119540004453,\"longitude\":120.80390109094627},{\"latitude\":29.15822618380072,\"longitude\":120.8035977332099},{\"latitude\":29.15831288145693,\"longitude\":120.80407943592267},{\"latitude\":29.158339538132186,\"longitude\":120.80393942500581},{\"latitude\":29.158339546684264,\"longitude\":120.80406610131104},{\"latitude\":29.158211221000066,\"longitude\":120.80414110827705},{\"latitude\":29.157651241851863,\"longitude\":120.80428279122785},{\"latitude\":29.15763790845569,\"longitude\":120.80427779098535},{\"latitude\":29.158282832977456,\"longitude\":120.8033610475584},{\"latitude\":29.15813120756393,\"longitude\":120.80391775876959},{\"latitude\":29.158082882199157,\"longitude\":120.8040211004609},{\"latitude\":29.158182872164222,\"longitude\":120.80390275710664},{\"latitude\":29.157784554250007,\"longitude\":120.8040111026851},{\"latitude\":29.157649559014533,\"longitude\":120.80404110631613},{\"latitude\":29.15819286107464,\"longitude\":120.80374274473637},{\"latitude\":29.15822287123858,\"longitude\":120.80390108991239},{\"latitude\":29.158116200850827,\"longitude\":120.80381441767662},{\"latitude\":29.15809622501319,\"longitude\":120.80416611131747},{\"latitude\":29.158072903952153,\"longitude\":120.80434279151346},{\"latitude\":29.15816957308363,\"longitude\":120.80440946220341},{\"latitude\":29.158449518424646,\"longitude\":120.803682737545},{\"latitude\":29.158219537520818,\"longitude\":120.80389442276945},{\"latitude\":29.157956201148505,\"longitude\":120.80377108261662},{\"latitude\":29.15835121513252,\"longitude\":120.80409610346936},{\"latitude\":29.15839788387396,\"longitude\":120.80414110640943},{\"latitude\":29.158052886178055,\"longitude\":120.80407110455853},{\"latitude\":29.157891227052502,\"longitude\":120.80413444430756},{\"latitude\":29.15774290030762,\"longitude\":120.80418778315517},{\"latitude\":29.157562908754702,\"longitude\":120.80425945702338},{\"latitude\":29.15777123273071,\"longitude\":120.80418278249428},{\"latitude\":29.15821956208544,\"longitude\":120.80425945045403},{\"latitude\":29.1584428850833,\"longitude\":120.80417277501932},{\"latitude\":29.158212871667764,\"longitude\":120.80390442360053},{\"latitude\":29.158284542856265,\"longitude\":120.80399276295425},{\"latitude\":29.15834621018258,\"longitude\":120.8040210978262},{\"latitude\":29.158346211643597,\"longitude\":120.80404276613947},{\"latitude\":29.157946213804347,\"longitude\":120.80395443008535},{\"latitude\":29.15791454597557,\"longitude\":120.80392776170089},{\"latitude\":29.158294537127162,\"longitude\":120.80391108995946},{\"latitude\":29.158316205949816,\"longitude\":120.80394942600213},{\"latitude\":29.157634534864606,\"longitude\":120.80368107890415},{\"latitude\":29.157661197906595,\"longitude\":120.80363607516202},{\"latitude\":29.158021201191552,\"longitude\":120.80379108350283},{\"latitude\":29.157332865971373,\"longitude\":120.80355940584377},{\"latitude\":29.15788620858229,\"longitude\":120.80385942342666},{\"latitude\":29.15857288411588,\"longitude\":120.80419777560583},{\"latitude\":29.157812888357267,\"longitude\":120.8040311039223},{\"latitude\":29.157806227211402,\"longitude\":120.80411111005834},{\"latitude\":29.15783289814516,\"longitude\":120.80418278187736},{\"latitude\":29.157811219700104,\"longitude\":120.8040011016575},{\"latitude\":29.15794955258563,\"longitude\":120.80403610293497},{\"latitude\":29.158261218081513,\"longitude\":120.8041127722991},{\"latitude\":29.15859453351411,\"longitude\":120.8039477564234},{\"latitude\":29.1579811976831,\"longitude\":120.80372774569949},{\"latitude\":29.158139537901953,\"longitude\":120.80387608883439},{\"latitude\":29.157986199857152,\"longitude\":120.80376108154772},{\"latitude\":29.157296224856527,\"longitude\":120.80392276750499},{\"latitude\":29.157637893370925,\"longitude\":120.80405277398555},{\"latitude\":29.158109530344213,\"longitude\":120.80375607992923},{\"latitude\":29.15572791278466,\"longitude\":120.80376777131633},{\"latitude\":29.157922865648352,\"longitude\":120.80372941307814},{\"latitude\":29.157896199637094,\"longitude\":120.80373108013991},{\"latitude\":29.157856203861115,\"longitude\":120.80378108438556},{\"latitude\":29.15806952705746,\"longitude\":120.80369607570896},{\"latitude\":29.157874543963086,\"longitude\":120.80388609225065},{\"latitude\":29.157894541972823,\"longitude\":120.80386275693182},{\"latitude\":29.15784120892991,\"longitude\":120.80385108990535},{\"latitude\":29.094189463681705,\"longitude\":120.78892523218268},{\"latitude\":29.094286093230018,\"longitude\":120.78859852464808},{\"latitude\":29.090090845466435,\"longitude\":120.78568319750256},{\"latitude\":29.090177523174606,\"longitude\":120.78579321095758},{\"latitude\":29.090215865363124,\"longitude\":120.78587655473396},{\"latitude\":29.09026420639536,\"longitude\":120.78595156398063},{\"latitude\":29.15886620320714,\"longitude\":120.80407443000682},{\"latitude\":29.15889620629466,\"longitude\":120.8041294338738},{\"latitude\":29.15863452671165,\"longitude\":120.80385941593914},{\"latitude\":29.158514519953123,\"longitude\":120.80372440677306},{\"latitude\":29.158487848810037,\"longitude\":120.80365106804994},{\"latitude\":29.161166148733432,\"longitude\":120.80396106503383},{\"latitude\":29.1616244849591,\"longitude\":120.80414274090673},{\"latitude\":29.1616428213817,\"longitude\":120.80419441129327},{\"latitude\":29.16154283575823,\"longitude\":120.80437942619868},{\"latitude\":29.158588041700625,\"longitude\":120.80669295330858},{\"latitude\":29.1579345470363,\"longitude\":120.80394942982076},{\"latitude\":29.157892885383408,\"longitude\":120.80401110160128},{\"latitude\":29.158054531802552,\"longitude\":120.80376108086404},{\"latitude\":29.157947851190592,\"longitude\":120.80352606377042},{\"latitude\":29.158097863459574,\"longitude\":120.80374941286648},{\"latitude\":29.158177865583994,\"longitude\":120.80380441629227},{\"latitude\":29.158249536119754,\"longitude\":120.80388275491045},{\"latitude\":29.158292867780695,\"longitude\":120.80387108691761},{\"latitude\":29.158309532297043,\"longitude\":120.80384441804223},{\"latitude\":29.15827952802742,\"longitude\":120.80377274617632},{\"latitude\":29.157971206063255,\"longitude\":120.80384775501604},{\"latitude\":29.157992873761813,\"longitude\":120.80386942312497},{\"latitude\":29.158091220863,\"longitude\":120.8041027732425},{\"latitude\":29.158209530358462,\"longitude\":120.80378608123446},{\"latitude\":29.158076188335542,\"longitude\":120.80361940305434},{\"latitude\":29.158206211677197,\"longitude\":120.80400109770561},{\"latitude\":29.158136197946902,\"longitude\":120.80377774799467},{\"latitude\":29.158721100975697,\"longitude\":120.80256097955173},{\"latitude\":29.15849782246891,\"longitude\":120.80327270515205},{\"latitude\":29.158524494964656,\"longitude\":120.80336437873412},{\"latitude\":29.15850783647999,\"longitude\":120.80347772107585},{\"latitude\":29.1585495170767,\"longitude\":120.8036927373157},{\"latitude\":29.15863451591912,\"longitude\":120.80370107044102},{\"latitude\":29.1586311857283,\"longitude\":120.80374607394018},{\"latitude\":29.157984583459985,\"longitude\":120.80450947151213},{\"latitude\":29.15794292192588,\"longitude\":120.80457447675877},{\"latitude\":29.158101213360027,\"longitude\":120.8039944315821},{\"latitude\":29.157562895679327,\"longitude\":120.80406444228811},{\"latitude\":29.157474565260994,\"longitude\":120.80408111110278},{\"latitude\":29.158257854282986,\"longitude\":120.80366273791914},{\"latitude\":29.158331182583055,\"longitude\":120.80361106652474},{\"latitude\":29.1581345317685,\"longitude\":120.80378441519021},{\"latitude\":29.158237869916316,\"longitude\":120.80388608861546},{\"latitude\":29.15798120200398,\"longitude\":120.80379108390302},{\"latitude\":29.157894530497746,\"longitude\":120.80369441066472},{\"latitude\":29.157836203926408,\"longitude\":120.80377608420149},{\"latitude\":29.158237883092905,\"longitude\":120.80408110346615},{\"latitude\":29.15827287788945,\"longitude\":120.80401443138629},{\"latitude\":29.158309543023627,\"longitude\":120.8040027634652},{\"latitude\":29.158357874136584,\"longitude\":120.80398442825268},{\"latitude\":29.15842120798379,\"longitude\":120.80401109631526},{\"latitude\":29.158467874264442,\"longitude\":120.80401942981544},{\"latitude\":29.158492882726183,\"longitude\":120.80415277300773},{\"latitude\":29.158567887227207,\"longitude\":120.80424277904767},{\"latitude\":29.158686224046,\"longitude\":120.80433111783553},{\"latitude\":29.158799560059048,\"longitude\":120.80440612231769},{\"latitude\":29.15892122888858,\"longitude\":120.80447612632521},{\"latitude\":29.159167899221256,\"longitude\":120.8046078003074},{\"latitude\":29.159357903661018,\"longitude\":120.80473447443062},{\"latitude\":29.159682912654045,\"longitude\":120.80497448876248},{\"latitude\":29.15996791823242,\"longitude\":120.80515116539823},{\"latitude\":29.160219587239148,\"longitude\":120.80526783795604},{\"latitude\":29.160451257140423,\"longitude\":120.8053928445974},{\"latitude\":29.160684594782857,\"longitude\":120.80553618580512},{\"latitude\":29.158056204223524,\"longitude\":120.80384608737128},{\"latitude\":29.157969542825192,\"longitude\":120.80389775885891},{\"latitude\":29.15796454529874,\"longitude\":120.80393276158233},{\"latitude\":29.158082865356057,\"longitude\":120.80377274814407},{\"latitude\":29.158209517358152,\"longitude\":120.80359606658095},{\"latitude\":29.158237842426473,\"longitude\":120.80348439096306},{\"latitude\":29.15817951579071,\"longitude\":120.80356439776061},{\"latitude\":29.158124522059115,\"longitude\":120.80363940411729},{\"latitude\":29.15796621587696,\"longitude\":120.80399109934565},{\"latitude\":29.157981196202226,\"longitude\":120.80370607736364},{\"latitude\":29.157936174508578,\"longitude\":120.80337771899688},{\"latitude\":29.157922842370194,\"longitude\":120.80339105350542},{\"latitude\":29.157864539635945,\"longitude\":120.8038194205781},{\"latitude\":29.157911197737853,\"longitude\":120.80370774485915},{\"latitude\":29.157877870428553,\"longitude\":120.80378608455287},{\"latitude\":29.157922868378492,\"longitude\":120.80376941615536},{\"latitude\":29.158017881831963,\"longitude\":120.80399609920937},{\"latitude\":29.157954548546314,\"longitude\":120.80397776511366},{\"latitude\":29.158197840130175,\"longitude\":120.8034393878587},{\"latitude\":29.15827950052108,\"longitude\":120.80337271517064},{\"latitude\":29.158217843867796,\"longitude\":120.80349939232987},{\"latitude\":29.158046195907374,\"longitude\":120.80372107786906},{\"latitude\":29.1580295373053,\"longitude\":120.80383442007738},{\"latitude\":29.15791119271591,\"longitude\":120.80363440586528},{\"latitude\":29.15794455347354,\"longitude\":120.80404777053792},{\"latitude\":29.15789455763049,\"longitude\":120.80409444124528},{\"latitude\":29.157906175464454,\"longitude\":120.80338271968782},{\"latitude\":29.157914556663798,\"longitude\":120.80408610708015},{\"latitude\":29.158074561689006,\"longitude\":120.80420944813841},{\"latitude\":29.158192892395405,\"longitude\":120.80420611336979},{\"latitude\":29.158047866066994,\"longitude\":120.80377274849424},{\"latitude\":29.157649547060828,\"longitude\":120.80386442617719},{\"latitude\":29.15753954464598,\"longitude\":120.80379608870562},{\"latitude\":29.157561203818428,\"longitude\":120.8036927472044},{\"latitude\":29.157497867889006,\"longitude\":120.80363607679607},{\"latitude\":29.15820617467668,\"longitude\":120.80345938933375},{\"latitude\":29.157799563701214,\"longitude\":120.80415611352973},{\"latitude\":29.157807902778472,\"longitude\":120.80424445344349},{\"latitude\":29.157887892443622,\"longitude\":120.80411444282713},{\"latitude\":29.157782878252853,\"longitude\":120.80387275881439},{\"latitude\":29.157872871892447,\"longitude\":120.80380608613844},{\"latitude\":29.15816285986245,\"longitude\":120.80371607631662},{\"latitude\":29.15810120613911,\"longitude\":120.80388775677702},{\"latitude\":29.158256177111983,\"longitude\":120.8035093927237},{\"latitude\":29.158339533272823,\"longitude\":120.80386775286223},{\"latitude\":29.1578628592206,\"longitude\":120.80361773839323},{\"latitude\":29.157684526187566,\"longitude\":120.80356940310092},{\"latitude\":29.158141217380425,\"longitude\":120.8040661032954},{\"latitude\":29.158174558876727,\"longitude\":120.80419777959126},{\"latitude\":29.1582262322845,\"longitude\":120.80431445452069},{\"latitude\":29.15868616940747,\"longitude\":120.80352438958634},{\"latitude\":29.15887282375891,\"longitude\":120.80340104478006},{\"latitude\":29.1582978340597,\"longitude\":120.80338104897183},{\"latitude\":29.15781120045219,\"longitude\":120.80371774663016},{\"latitude\":29.158596176053123,\"longitude\":120.8035943959161},{\"latitude\":29.15844951465569,\"longitude\":120.80362773329665},{\"latitude\":29.15549639336555,\"longitude\":120.80596126756518},{\"latitude\":29.15520799332026,\"longitude\":120.80481785539895},{\"latitude\":29.155149642264732,\"longitude\":120.80452950135191},{\"latitude\":29.155102957953183,\"longitude\":120.80424948087257},{\"latitude\":29.15510959956939,\"longitude\":120.80387945272875},{\"latitude\":29.155107928404803,\"longitude\":120.80381278097165},{\"latitude\":29.15811619903474,\"longitude\":120.80378774896299},{\"latitude\":29.158147860850526,\"longitude\":120.80372607723693},{\"latitude\":29.158081193715162,\"longitude\":120.80369940918257},{\"latitude\":29.158084516229383,\"longitude\":120.80354273036366},{\"latitude\":29.15795618653511,\"longitude\":120.80355773281154}]";
        Gson gson=new Gson();

        List<GpsLocation> list=gson.fromJson(json,new TypeToken<ArrayList<GpsLocation>>(){}.getType());
        List<GpsLocation> result=createFrom2DGps(list);
        String s=gson.toJson(result);
        System.out.println(s);
    }
    /**
     * Smoothens float value stream using kalman filter.
     * 利用卡尔曼滤波平滑浮点值流。
     * @param stream Float Stream.
     * @return Observable.
     */
    public static List<Float> createFrom1D(List<Float> stream) throws Exception {
        final JKalman kalman = new JKalman(2, 1);
        // measurement [x]
        final Matrix m = new Matrix(1, 1);

        // transitions for x, dx
        double[][] tr = {{1, 0},
                {0, 1}};
        kalman.setTransition_matrix(new Matrix(tr));

        // 1s somewhere?
        kalman.setError_cov_post(kalman.getError_cov_post().identity());

        List<Float> floats = new ArrayList<>();
        stream.stream().forEach(value -> {
            m.set(0, 0, value);
            // state [x, dx]
            Matrix s = kalman.Predict();
            // corrected state [x, dx]
            Matrix c = kalman.Correct(m);
            floats.add((float) c.get(0, 0));
        });
        return floats;
    }
    /**
     * Smoothens (float,float) value stream using kalman filter.
     * 平滑(浮，浮)值流使用卡尔曼滤波器
     * @param stream Float Stream.
     * @return Observable.
     */
    public static List<float[]> createFrom2D(List<float[]> stream) throws Exception {
        final JKalman kalman = new JKalman(4, 2);
        // measurement [x]
        final Matrix m = new Matrix(2, 1);
        // transitions for x, y, dx, dy
        double[][] tr = {{1, 0, 1, 0},
                {0, 1, 0, 1},
                {0, 0, 1, 0},
                {0, 0, 0, 1}};
        kalman.setTransition_matrix(new Matrix(tr));
        // 1s somewhere?
        kalman.setError_cov_post(kalman.getError_cov_post().identity());
        final float[] buffer = new float[2];
        List<float[]> floats = new ArrayList<>();
        stream.stream().forEach(values -> {
            m.set(0, 0, values[0]);
            m.set(1, 0, values[1]);
            // state [x, dx]
            Matrix s = kalman.Predict();
            // corrected state [x, dx]
            Matrix c = kalman.Correct(m);
            buffer[0] = (float) c.get(0, 0);
            buffer[1] = (float) c.get(1, 0);
            floats.add(buffer);
        });
        return floats;
    }
    /**
     * Smoothens (float,float) value stream using kalman filter.
     * 平滑(浮，浮)值流使用卡尔曼滤波器
     * @param stream Float Stream.
     * @return Observable.
     */
    public static List<GpsLocation> createFrom2DGps(List<GpsLocation> stream) throws Exception {
        final JKalman kalman = new JKalman(4, 2);
        // measurement [x]
        final Matrix m = new Matrix(2, 1);
        // transitions for x, y, dx, dy
        double[][] tr = {{1, 0, 1, 0},
                {0, 1, 0, 1},
                {0, 0, 1, 0},
                {0, 0, 0, 1}};
        kalman.setTransition_matrix(new Matrix(tr));
        // 1s somewhere?
        kalman.setError_cov_post(kalman.getError_cov_post().identity());
        List<GpsLocation> floats = new ArrayList<>();
        stream.stream().forEach(values -> {
            m.set(0, 0, values.getLatitude());
            m.set(1, 0, values.getLongitude());
            // state [x, dx]
            Matrix s = kalman.Predict();
            // corrected state [x, dx]
            Matrix c = kalman.Correct(m);
            GpsLocation gpsLocation=new GpsLocation();
            double x=c.get(0, 0);
            double y= c.get(1, 0);
            gpsLocation.setLatitude(x);
            gpsLocation.setLongitude(y);
            floats.add(gpsLocation);
        });
        return floats;
    }
    /**
     * Smoothens (float,float,float) value stream using kalman filter.
     * 使用卡尔曼滤波平滑(浮，浮，浮)值流
     * @param stream Float Stream.
     * @return Observable.
     */
    public static List<float[]> createFrom3D(List<float[]> stream) throws Exception {
        final JKalman kalman = new JKalman(6, 3);
        // measurement [x, y, z]
        Matrix m = new Matrix(3, 1);
        // transitions for x, y, z, dx, dy, dz (velocity transitions)
        double[][] tr = {{1, 0, 0, 1, 0, 0},
                {0, 1, 0, 0, 1, 0},
                {0, 0, 1, 0, 0, 1},
                {0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 1, 0},
                {0, 0, 0, 0, 0, 1}};
        kalman.setTransition_matrix(new Matrix(tr));
        // 1s somewhere?
        kalman.setError_cov_post(kalman.getError_cov_post().identity());
        final float[] buffer = new float[3];
        List<float[]> floats = new ArrayList<>();
        stream.stream().forEach(values -> {
            m.set(0, 0, values[0]);
            m.set(1, 0, values[1]);
            m.set(2, 0, values[2]);
            // state [x, y, z, dx, dy, dz]
            Matrix s = kalman.Predict();
            // corrected state [x, y,z, dx, dy, dz, dxyz]
            Matrix c = kalman.Correct(m);
            buffer[0] = (float) c.get(0, 0);
            buffer[1] = (float) c.get(1, 0);
            buffer[2] = (float) c.get(2, 0);
            floats.add(buffer);
        });
        return floats;
    }
    /**
     * Applies low pass filter for (float,float,float) value stream.
     * 对(float,float,float)值流应用低通滤波器-卡尔曼滤波器的默认实现是一个迭代过程，使用上一次的结果预测当前的值，同时使用观测值修正当前值，得到最优结果
     * @param stream Float Stream.
     * @return Observable.
     */
    public static List<float[]> createLowPassFilter(List<float[]> stream) {
        return createLowPassFilter(stream, 0.8f);
    }
    public static List<float[]> createLowPassFilter(List<float[]> stream, final float alpha) {
        final float[] output = new float[3];
        final float[] gravity = new float[3];
        List<float[]> floats = new ArrayList<>();
        stream.stream().forEach(values -> {
            // skip invalid values
            if (values == null || values.length != 3)
                return;
            // apply low pass filter
            applyLowPassFilter(values, output, gravity, alpha);
            // pass values
            floats.add(output);
        });
        return floats;
    }
    /**
     * In this example, alpha is calculated as t / (t + dT),
     * where t is the low-pass filter's time-constant and
     * dT is the event delivery rate.
     * 在这个例子中，alpha被计算为t/ (t + dT)，其中t是Low-pass过滤器的时间常数，dT是事件交付率。
     */
    static void applyLowPassFilter(float[] input, float[] output, float[] gravity, float alpha) {
        // Isolate the force of gravity with the low-pass filter.
        gravity[0] = alpha * gravity[0] + (1 - alpha) * input[0];
        gravity[1] = alpha * gravity[1] + (1 - alpha) * input[1];
        gravity[2] = alpha * gravity[2] + (1 - alpha) * input[2];
        // Remove the gravity contribution with the high-pass filter.
        output[0] = input[0] - gravity[0];
        output[1] = input[1] - gravity[1];
        output[2] = input[2] - gravity[2];
    }
}
