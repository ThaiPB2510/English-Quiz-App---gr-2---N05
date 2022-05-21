package com.example.mad_n2_t16;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.text.method.ScrollingMovementMethod;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class Theory extends AppCompatActivity {
    int page = 1;
    String title1 = "goc";
    String page1 = "goc";
    String title2;
    String page2;
    String title3;
    String page3;
    String title4;
    String page4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /*ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        actionBar.setCustomView(R.layout.toolbar_title_layout);
        actionBar.setDisplayHomeAsUpEnabled(true);*/

        setContentView(R.layout.activity_basic_theory);

        String title11 = "Các từ loại";
        String page11 = "<p><strong>1. Danh từ (Nouns):</strong> Là từ gọi tên người, đồ vật, sự việc hay nơi chốn.</p>" +
                "<p>Ex: teacher, desk, sweetness, city</p>" +
                "<p></p>" +
                "<p><strong>2. Đại từ (Pronouns):</strong> Là từ dùng thay thế cho danh từ để không phải dùng lại danh từ ấy nhiều lần.</p>" +
                "<p>Ex: I, you, them, who, that, himself, someone.</p>" +
                "<p></p>" +
                "<p><strong>3. Tính từ (adjectives):</strong> Là từ cung cấp tính chất cho danh từ, làm cho danh từ rõ nghĩa hơn, chính xác và đầy đủ hơn.</p>" +
                "<p>Ex: a dirty hand, a new dress, the car is new.</p>" +
                "<p></p>" +
                "<p><strong>4. Động từ (Verbs):</strong> Là từ diễn tả một hành động, một tình trạng hay một cảm xúc. Nó xác định chủ từ làm hay chịu đựng một điều gì.</p>" +
                "<p>Ex: The boy played football. he is hungry. The cake was cut.</p>" +
                "<p></p>" +
                "<p><strong>5. Trạng từ (Adverbs):</strong> Là từ bổ sung ý nghĩa cho mọt động từ, một tính từ hay một trạng từ khác. Tương tự như tính từ, nó làm cho các từ mà nó bổ nghĩa rõ ràng, đầy đủ và chính xác hơn.</p>" +
                "<p>Ex: He ran quickly. I saw him yesterday. It is very large.</p>" +
                "<p></p>" +
                "<p><strong>6. Giới từ (Prepositions):</strong> Là từ thường dùng với danh từ và đại từ hay chỉ mối tương quan giữa các từ này với từ khác, thường là nhằm để diễn tả mối tương quan về hoàn cảnh, thời gian hay vị trí.</p>" +
                "<p>Ex: It went by air mail. The desk was near the window.</p>" +
                "<p></p>" +
                "<p><strong>7. Liên từ (Conjunctions):</strong> Là từ nối các từ (words), ngữ (phrases) hay câu (sentences) lại với nhau.</p>" +
                "<p>Ex: Peter and Bill are students. He work hard because he wanted to succeeds.</p>" +
                "<p></p>" +
                "<p><strong>8. Thán từ (Interjections):</strong> Là từ diễn tả tình cảm hay cảm xúc đột ngột, không ngờ. Các từ loại này không can thiệp vào cú pháp của câu.</p>" +
                "<p>Ex: Hello! Oh! Ah!</p>";
        String title21 = "Danh từ và cách đếm";
        String page21 = "<p><strong>Danh từ đếm được (Countable nouns):</strong> Một danh từ được xếp vào loại đếm được khi chúng ta có thể đếm trực tiếp người hay vật ấy. Phần lớn danh từ cụ thể đều thuộc vào loại đếm được.</p>" +
                "<p>Ví dụ: boy (cậu bé), apple (quả táo), book (quyển sách), tree (cây)...</p>" +
                "<p></p>" +
                "<p><strong>Danh từ không đếm được (Uncountable nouns):</strong> Một danh từ được xếp vào loại không đếm được khi chúng ta không đếm trực tiếp người hay vật ấy. Muốn đếm, ta phải thông qua một đơn vị đo lường thích hợp. Phần lớn danh từ trừu tượng đều thuộc vào loại không đếm được.</p>" +
                "<p>Ví dụ: meat (thịt), ink (mực), chalk (phấn), water (nước)...</p>" +
                "<p></p>" +
                "<p><strong>Số nhiều của danh từ</strong></p>" +
                "<p>Một được xem là số ít (singular). Từ hai trở lên được xem là số nhiều (plural). Danh từ thay đổi theo số ít và số nhiều</p>" +
                "<p></p>" +
                "<p><strong>Nguyên tắc đổi sang số nhiều</strong></p>" +
                "<p>1. Thông thường danh từ lấy thêm S ở số nhiều.</p>" +
                "<p>Ví dụ: chair - chairs ; girl - girls ; dog - dogs</p>" +
                "<p>2. Những danh từ tận cùng bằng O, X, S, Z, CH, SH lấy thêm ES ở số nhiều.</p>" +
                "<p>Ví dụ: potato - potatoes ; box - boxes ; bus - buses ; buzz - buzzes ; watch - watches ; dish - dishes</p>" +
                "<p>3. Những danh từ tận cùng bằng phụ âm + Y thì chuyển Y thành I trước khi lấy thêm ES.</p>" +
                "<p>Ví dụ: lady - ladies ; story - stories</p>" +
                "<p>4. Những danh từ tận cùng bằng F hay FE thì chuyển thành VES ở số nhiều.</p>" +
                "<p>Ví dụ: leaf - leaves, knife - knives</p>";
        String title31 = "Cách phát âm S tận cùng";
        String page31 = "<p>S tận cùng (ending S) được phát âm như sau:</p>" +
                "<p><strong>1. Được phát âm là /z/:</strong> khi đi sau các nguyên âm và các phụ âm tỏ (voiced consonants), cụ thể là các phụ âm sau: /b/, /d/, /g/, /v/, /T/, /m/, /n/, /N/, /l/, /r/.</p>" +
                "<p>Ví dụ: boys, lies, ways, pubs, words, pigs, loves, bathes, rooms, turns, things, walls, cars.</p>" +
                "<p></p>" +
                "<p><strong>2. Được phát âm là /s/:</strong> khi đi sau các phụ âm điếc (voiceless consonants), cụ thể là các phụ âm sau: /f/, /k/, /p/, /t/ và /H/.</p>" +
                "<p>Ví dụ: laughs, walks, cups, cats, tenths.</p>" +
                "<p></p>" +
                "<p><strong>3. Được phát âm là /iz/:</strong> khi đi sau một phụ âm rít (hissing consonants), cụ thể là các phụ âm sau: /z/, /s/, /dZ/, /tS/, /S/, /Z/.</p>" +
                "<p>Ví dụ: refuses, passes, judges, churches, garages, wishes.</p>";
        String title41 = "Một số kiến thức bổ sung";
        String page41 = "<p><strong>Những danh từ sau đây có số nhiều đặc biệt:</strong></p>" +
                "<p>man - men: đàn ông</p>" +
                "<p>woman - women: phụ nữ</p>" +
                "<p>child - children: trẻ con</p>" +
                "<p>tooth - teeth: cái răng</p>" +
                "<p>foot - feet: bàn chân</p>" +
                "<p>mouse - mice: chuột nhắt</p>" +
                "<p>goose - geese: con ngỗng</p>" +
                "<p>louse - lice: con rận</p>" +
                "<p></p>" +
                "<p><strong>Những danh từ sau đây có hình thức số ít và số nhiều giống nhau:</strong></p>" +
                "<p>deer: con nai</p>" +
                "<p>sheep: con cừu</p>" +
                "<p>swine: con heo</p>" +
                "<p></p>" +
                "<p><strong>Mạo từ (Article)</strong></p>" +
                "<p>Trong tiếng Việt ta vẫn thường nói như: cái nón, chiếc nón, trong tiếng Anh những từ có ý nghĩa tương tự như cái và chiếc đó gọi là mạo từ (Article).</p>" +
                "<p>Tiếng Anh có các mạo từ: the /Tə/, a /ən/, an /ân/</p>" +
                "<p>Các danh từ thường có các mạo từ đi trước.</p>" +
                "<p>Ví dụ: the hat (cái nón), the house (cái nhà), a boy (một cậu bé)...</p>";

        String title12 = "Cấu trúc so sánh";
        String page12 = "<p><strong>1. Cấu trúc so sánh nhất</strong></p>" +
                "<p>So sánh nhất dùng khi so sánh 3 đối tượng trở lên, trong đó có 1 đối tượng là ưu việt nhất so với những đối tượng còn lại về mọi mặt. Để biến tính từ và phó từ thành dạng so sánh nhất, ta áp dụng những quy tắc sau:</p>" +
                "<p>-Đối với tính từ, phó từ ngắn: <strong>S + V + the + adj/adv - est + in/of + N</strong></p>" +
                "<p>Ví dụ: </p>" +
                "<p>&emsp+John is the tallest boy in the family (John là cậu bé cao nhất nhà)</p>" +
                "<p>&emsp+She is the shortest of three sister (Cô ấy thấp nhất trong 3 chị em)</p>" +
                "<p>-Đối với tính từ, phó từ dài: <strong>S + V + the most/least + adj/adv + in/of + N</strong></p>" +
                "<p>Ví dụ: </p>" +
                "<p>&emsp+This hat is the most expensive of all. (Chiếc mũ này đắt nhất trong số này)</p>" +
                "<p>&emsp+All of students, he is the least intelligent. (Anh ấy thông minh nhất trong tất cả học sinh)</p>" +
                "<p></p>" +
                "<p><strong>2. Cấu trúc so sánh kép</strong></p>" +
                "<p>Với dạng so sánh kép (càng ... càng), chúng ta có thể vận dụng 2 cấu trúc dưới đây:</p>" +
                "<p><strong>The + adj  + S + V + the + adj + S + V (Càng ... càng)</strong></p>" +
                "<p>Ví dụ: The hotter it is, the more miserable I feel (Trời càng nóng, tôi càng thấy khó chịu)</p>" +
                "<p><strong>The more + S + V + the + adj/adv so sánh + S + V (Càng ... càng)</strong></p>" +
                "<p>Ví dụ: The more you study, the smarter you will become (Càng học, bạn càng thông minh hơn)</p>" +
                "<p></p>" +
                "<p><strong>3. Cấu trúc so sánh hơn kém</strong></strong></p>" +
                "<p>-Với tính từ ngắn (Adj short) và phó từ ngắn (Adv short):</p>" +
                "<p>Cấu trúc: <strong>S + V + adj/adv - er + than + N/P</strong></p>" +
                "<p>Ví dụ: Today is hotter than yesterday (Hôm nay nóng hơn hôm qua)</p>" +
                "<p>-Với tính từ dài (Adj long) và phó từ dài (Adv long)</p>" +
                "<p>Cấu trúc: <strong>S + V + more/less + adj/adv + than + N/P</strong></p>" +
                "<p></p>" +
                "<p><strong>4. Cấu trúc so sánh ngang bằng</strong></p>" +
                "<p>Cấu trúc: <strong>S + V + as + adj/adv + as + N/ P</strong> (giống như, bằng như)</p>" +
                "<p>Ví dụ: My book is as interesting as yours</p>" +
                "<p>Cấu trúc: <strong>S + V + the same + N + as + N/P</strong> (giống như)..</p>" +
                "<p>Ví dụ: He speaks the same language as she (anh ấy nói ngôn ngữ giống cô ấy)</p>";
        String title22 = "Câu điều kiện";
        String page22 = "<p><strong>1. Khái niệm</strong></p>" +
                "<p>Câu điều kiện là câu dùng để đưa ra một giả định về một sự việc trong quá khứ, hiện tại hay tương lai.</p>" +
                "<p></p>" +
                "<p><strong>2. Cấu tạo</strong></p>" +
                "<p>Câu điều kiện gồm 2 vế:</p>" +
                "<p>&emsp<strong>Mệnh đề chứa if (mệnh đề điều kiện) + mệnh đề chính (mệnh đề chỉ kết quả)</strong></p>" +
                "<p>Vị trí của 2 mệnh đề:</p>" +
                "<p>&emsp-Khi mệnh đề chứa “if” đứng đầu thì giữa hai mệnh đề ngăn cách với nhau bằng dấu phẩy.</p>" +
                "<p>&emsp-Khi mệnh đề chứa “if” đứng sau mệnh đề chỉ kết quả thì KHÔNG sử dụng dấu phẩy để ngăn cách hai mệnh đề.</p>" +
                "<p>Ví dụ: If I have a lot of money, I will buy a new house. (Nếu tôi có nhiều tiền, tôi sẽ mua một ngôi nhà.)</p>";
        String title32 = "Câu giả định - Subjunctive";
        String page32 = "<p><strong>1. Khái niệm</strong></p>" +
                "<p>Câu giả định là câu dùng động từ để diễn tả những gì trái với thực tế hoặc chưa thực hiện, những gì còn nằm trong suy nghĩ. Hiểu đơn giản là loại câu đối tượng thứ nhất muốn đối tượng thứ hai làm một việc gì đó.</p>" +
                "<p>Câu giả định có tính chất cầu khiến chứ không mang tính ép buộc như câu mệnh lệnh. Trong câu giả định, người ta dùng dạng nguyên thể không có \"to\" của các động từ sau một số động từ chính mang tính cầu khiến. Thường có that trong câu giả định.</p>" +
                "<p></p>" +
                "<p><strong>2. Cách dùng</strong></p>" +
                "<p>Dưới đây là một số cách dùng của câu giả định:</p>" +
                "<p>-Câu giả định dùng would rather (muốn/ ước) và that</p>" +
                "<p>Ví dụ: I would rather that you call me tomorrow. (Tôi muốn bạn gọi cho tôi vào ngày mai) - (Nhưng bạn có thể gọi hoặc không gọi)</p>" +
                "<p>-Câu giả định dùng với các động từ cầu khiến</p>" +
                "<p>Ví dụ: We recommend that he go with us. (Chúng tôi đề nghị là anh ta đi với chúng tôi)</p>" +
                "<p>Câu giả định dùng với tính từ</p>" +
                "<p>Ví dụ: It is necessary that he find the books (Nó thưc sự cần thiết điều mà anh ấy tìm kiếm những cuốn sách).</p>";
        String title42 = "Câu cầu khiến / mệnh lệnh";
        String page42 = "<p><strong>1. Sai ai, khiến ai, bảo ai làm gì sử dụng Have và get</strong></p>" +
                "<p>Cấu trúc với have: <strong>S + have somebody + V-infinitve + N</strong></p>" +
                "p>Cấu trúc với get: <strong>S + get somebody + to + V-infinitve + N</strong></p>" +
                "<p>Ví dụ: I'll have Peter fix my car.</p>" +
                "<p></p>" +
                "<p><strong>2. Bắt buộc ai phải làm gì sử dụng make và force:</strong></p>" +
                "<p>Cấu trúc với make: <strong>S + make + somebody + V-infinitive + N</strong></p>" +
                "p>Cấu trúc với force: <strong>S + force + somebody to + V-infinitive + N</strong></p>" +
                "<p>Ví dụ: The bank robbers forced the manager to give them all the money. (Cướp ngân hàng bắt quản lý đưa cho họ toàn bộ số tiền)</p>" +
                "<p></p>" +
                "<p><strong>3. Để cho ai, cho phép ai làm gì sử dụng let và permit / allow:</strong></p>" +
                "<p>Cấu trúc với let: <strong>S + let + somebody + V-infinitive + N</strong></p>" +
                "<p>Cấu trúc với permit/allow: <strong>S + permit/allow + somebody + to + V-infinitive + N</strong></p>" +
                "<p>Ví dụ: I never want to let you go.</p>" +
                "<p></p>" +
                "<p><strong>4. Giúp ai làm gì  - HELP</strong></p>" +
                "<p>Cấu trúc: <strong>S + help + somebody + V-infinitive / to + V-infinitive + N</strong></p>" +
                "<p>Ví dụ: Please help me to throw this table away. (Làm ơn giúp tôi vứt cái bàn này đi)</p>";

        String title13 = "Câu trực tiếp - gián tiếp";
        String page13 = "<p><strong>1. Lời nói trực tiếp (Direct Speech)</strong></p>" +
                "<p>-Khi thuật lại lời nói của người khác, ta có thể nhắc lại nguyên văn lời nói, và khi viết phải đặt nó trong ngoặc kép \" \" -> Lời nói trực tiếp (Direct Speech)</p>" +
                "<p>Ví dụ: - Hoa said, \"I am going to the market in the afternoon\".(Hoa nói: \"Tôi sẽ đi chợ vào chiều nay\" )</p>" +
                "<p></p>" +
                "<p><strong>2. Lời nói gián tiếp ( Indirect Speech)</strong></p>" +
                "<p>-Khi thuật lại lời nói của người khác, ta có thể thay đổi và không cần phải dùng y nguyên những lời nói đó -> Lời nói gián tiếp ( Indirect Speech) </p>" +
                "<p>Ví dụ: - Hoa said that she was going to the market in the afternoon. (Hoa nói rằng cô ấy sẽ đi chợ vào chiều nay)</p>" +
                "<p></p>" +
                "<p><strong>3. Nguyên tắc chuyển từ lời nói trực tiếp sang gián tiếp</strong></p>" +
                "<p>Khi muốn chuyển từ lời nói trực tiếp sang gián tiếp, chúng ta phải thay đổi những yếu tố sau:</p>" +
                "<p>-Đổi ngôi thứ của đại từ nhân xưng, tính từ, đại từ sở hữu (Đổi chủ ngữ, tân ngữ)</p>" +
                "<p>-Đổi tính từ, phó từ, cụm phó từ chỉ thời gian</p>" +
                "<p>-Đổi thì</p>";
        String title23 = "Câu bị động (Passive voice)";
        String page23 = "<p><strong>1. Cấu trúc</strong></p>" +
                "<p><strong>Câu bị động (Passive Voice)</strong> là câu mà chủ ngữ là người hay vật chịu tác động của hành động, được sử dụng để nhấn mạnh đến đối tượng chịu tác động của hành động đó. Thì của câu bị động phải tuân theo thì của câu chủ động.</p>" +
                "<p>Công thức thể bị động: <strong>tobe + V3 / V_ed</strong></p>" +
                "<p>Ví dụ: A dog bit my son. → My son was bitten by a dog. (Con chó cắn con trai tôi. → Con trai tôi bị con chó cắn)</p>" +
                "<p></p>" +
                "<p><strong>2. Cách đổi các thì trong câu bị động</strong></p>" +
                "<p>Nhìn chung, việc chuyển đổi thể câu từ chủ động sang bị động có thể được thực hiện qua các bước sau:</p>" +
                "<p><strong>Bước 1:</strong> Xác định các thành phần tân ngữ (O) trong câu và đưa về đầu làm chủ ngữ (S)</p>" +
                "<p><strong>Bước 2:</strong> Xác định thì (tense) của câu thông qua dạng thức của động từ chính (V)</p>" +
                "<p><strong>Bước 3:</strong> Chuyển đổi động từ về dạng bị động “tobe + p.p” theo thì của câu gốc</p>" +
                "<p><strong>Bước 4:</strong> Chuyển đổi chủ ngữ (O) trong câu chủ động thành tân ngữ, đưa về cuối câu và thêm “by” phía trước.</p>";
        String title33 = "Đảo ngữ (Inversion)";
        String page33 = "<p><strong>1. Đảo ngữ trong câu điều kiện loại 1</strong></p>" +
                "<p>Câu đk loại 1:  If S + V (chia ở thì hiện tại đơn), S + will (not) + V nguyên thể</p>" +
                "<p><strong>Đảo ngữ đk loại 1:  Should + S + V (chia ở thì hiện tại), S + will/may/might/should/can (not)… + V nguyên thể</strong></p>" +
                "<p>Ví dụ: If you should hear the fire alarm, leave the building at once.</p>" +
                "<p>--> Should you hear the fire alarm, leave the building at once.</p>" +
                "<p>(Nếu bạn nghe tiếng báo động cháy nổ, hãy rời khỏi tòa nhà ngay tức khắc)</p>" +
                "<p></p>" +
                "<p><strong>2. Đảo ngữ trong câu điều kiện loại 2</strong></p>" +
                "<p>Câu điều kiện: If + S1 + V (chia ở thì quá khứ đơn), S2 + would/might/could… + V nguyên thể</p>" +
                "<p><strong>Câu đảo ngữ:  Were + S1 + (not) + O, S2 + would/might/could… + V nguyên thể</strong></p>" +
                "<p>Ví dụ: If I were you, I wouldn't do that -> Were I you, I wouldn't do that.</p>" +
                "<p>(Nếu tôi là bạn, tôi sẽ không làm điều đó)</p>";
        String title43 = "Mệnh đề quan hệ (Relative clause)";
        String page43 = "<p><strong>1. Mệnh đề quan hệ cơ bản</strong></p>" +
                "<p>Mệnh đề quan hệ (hay được gọi là mệnh đề tính từ) được đặt sau danh từ nó phụ nghĩa</p>" +
                "<p>Được nối bằng các đại từ quan hệ: <strong>Who, whom, which, that, whose và trạng từ quan hệ where, why, when</strong>.</p>" +
                "<p>&emsp&emsp<strong>Who</strong>: thay thế cho người, làm chủ ngữ trong mệnh đề quan hệ.</p>" +
                "<p>Ví dụ: I need to meet the boy. The boy is my son's friend.</p>" +
                "<p>--> I need to meet the bot <strong>who</strong> is my son's friend.</p>" +
                "<p></p>" +
                "<p><strong>2. Thêm giới từ vào trước mệnh đề tính từ (whom/which)</strong></p>" +
                "<p>Với các động từ đi kèm với giới từ, khi sử dụng mệnh đề quan hệ chúng ta sẽ đảo giới từ lên trước whom / Which</p>" +
                "<p>Ví dụ: The man speaks English very well. I <strong>talked to</strong> him last night.</p>" +
                "<p>--> The man <strong>to whom</strong> I talked last night speaks English very well.</p>" +
                "<p>Ví dụ: He asked me a lot of question. I couldn't answer most of them.</p>" +
                "<p>-->  He asked me a lot of questions, <strong>most of which</strong> I couldn't answer.</p>";

        int extra = getIntent().getExtras().getInt("extra");
        if (extra==1) {
            title1 = title11;
            page1 = page11;
            title2 = title21;
            page2 = page21;
            title3 = title31;
            page3 = page31;
            title4 = title41;
            page4 = page41;
        } else if (extra==2) {
            title1 = title12;
            page1 = page12;
            title2 = title22;
            page2 = page22;
            title3 = title32;
            page3 = page32;
            title4 = title42;
            page4 = page42;
        } else if (extra==3) {
            title1 = title13;
            page1 = page13;
            title2 = title23;
            page2 = page23;
            title3 = title33;
            page3 = page33;
            title4 = title43;
            page4 = page43;
        }

        TextView title = (TextView) findViewById(R.id.title);
        title.setText(title1);

        TextView text = (TextView) findViewById(R.id.textView);
        text.setMovementMethod(new ScrollingMovementMethod());
        text.setText(Html.fromHtml(page1));

        Button back = (Button) findViewById(R.id.back);
        back.setVisibility(View.GONE);

        Button next = (Button) findViewById(R.id.next);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (page == 2) {
                    text.scrollTo(0, 0);
                    title.setText(title1);
                    text.setText(Html.fromHtml(page1));
                    page--;
                    back.setVisibility(View.GONE);
                }
                else if (page == 3) {
                    text.scrollTo(0, 0);
                    title.setText(title2);
                    text.setText(Html.fromHtml(page2));
                    page--;
                }
                else if (page == 4) {
                    text.scrollTo(0, 0);
                    title.setText(title3);
                    text.setText(Html.fromHtml(page3));
                    page--;
                    next.setVisibility(View.VISIBLE);
                }
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (page == 1) {
                    text.scrollTo(0, 0);
                    title.setText(title2);
                    text.setText(Html.fromHtml(page2));
                    page++;
                    back.setVisibility(View.VISIBLE);
                }
                else if (page == 2) {
                    text.scrollTo(0, 0);
                    title.setText(title3);
                    text.setText(Html.fromHtml(page3));
                    page++;
                }
                else if (page == 3) {
                    text.scrollTo(0, 0);
                    title.setText(title4);
                    text.setText(Html.fromHtml(page4));
                    page++;
                    next.setVisibility(View.GONE);
                }
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}