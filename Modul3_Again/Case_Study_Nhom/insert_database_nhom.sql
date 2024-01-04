
use case_study_team;
-- 1Trinh thám,
-- 1: Raymond Chandler
-- 2:Higashino Keigo
-- 3:Miyabe Miyuki
-- 4:Higashino Keigo
-- 5:Lượng Lượng

-- 2:Kinh điển
-- 6:Gabriel García Márquez
-- 7:William Shakespeare
-- 8:Alphonse Daudet
-- 9:Vasily Semyonovich Grossman
-- 10:E.B.White
-- 11:Tôn Tử
-- 12:Neil Gaiman , Terry Pratchett
INSERT INTO `case_study_team`.`tac_gia` (`ten_tac_gia`) VALUES (
'Raymond Chandler'),("Higashino Keigo"),("Miyabe Miyuki"),("Higashino Keigo"),("Gabriel García Márquez"),("William Shakespeare"),("Alphonse Daudet"),("Vasily Semyonovich Grossman"),("E.B.White"),("Tôn Tử"),("Neil Gaiman ), (Terry Pratchett"
);
INSERT INTO `case_study_team`.`tac_gia` (`ten_tac_gia`) VALUES (
'Harper Lee'),("Franz Kafka"),("J.D. Salinger"),("Fyodor Dostoevsky"),(" Dan Brown"),("Thomas Harris"),("Lôi Mễ"),("Edgar Wallace"),("Anthony Robbins"),("Mark Manson"),("Robin Sharma" ), ("Rhonda Byrne"
);
INSERT INTO `case_study_team`.`tac_gia` (`ten_tac_gia`) VALUES (
'Sandi Wallace'),("Paul Austin Ardoin"),("Eileen Thornton"),("Ada Bell"),(" Lewis Carroll"),("Robert Louis Stevenson"),("L.M. Montgomery"),("Ray Bradbury"),("Paulo Coelho"),("James Clear"),("Daniel Kahneman" ), ("Don Miguel Ruiz "
);
INSERT INTO `case_study_team`.`tac_gia` (`ten_tac_gia`) VALUES (
'Dan Brown'),("Miyuki Miyabe"),("Yokomizo Seishi"),("Minette Walters"),(" Yusuke Kishi"),("Toni Morrison"),("Louisa May Alcott"),("Jerome David Salinger"),("ALAIN FOURNIER"),("Mark Manson"),("Margie Warpell" ), ("Don Miguel Ruiz "
);



insert into the_loai(ten_the_loai) values (
"Trinh thám"), ("Tiểu thuyết"), ("Self Help"
);


insert into sach(ma_san_pham, gia, so_luong, hinh_anh, mo_ta, id_the_loai, id_tac_gia)
values ('KẺ KHÔNG THỂ GIÃ TỪ',480000,30,'http://static.nhanam.com.vn/thumb/0x320/crop/Books/Images/2023/11/14/YQ3QX7I4.jpg','KIỆT TÁC TRINH THÁM ĐƯỢC MURAKAMI ĐÁNH GIÁ RẤT CAO!Một vụ án chưa giải quyết xong, một vụ án khác lại đến.
Ẩn dưới vẻ uể oải thường trực của đời sống giàu có, là những khuôn mặt người như những con búp bê sứ đã vỡ vụn từ lâu nhưng được chắp vá lại bằng sự hào nhoáng đến chán 
chường. Trong Kẻ không thể giã từ, một lần nữa độc giả cùng Philip Marlowe dấn bước vào vụ án càng lúc càng rắc rối, nơi những bóng ma quá khứ trở về để hoàn tất lời từ biệt.
“Tôi dịch những gì tôi thích đọc. Tôi đã dịch tất cả các tiểu thuyết của Raymond Chandler. Tôi thích phong cách của anh ấy rất nhiều. Tôi đã đọc The Long Goodbye năm hoặc sáu lần.”',1,1);

insert into sach(ma_san_pham, gia, so_luong, hinh_anh, mo_ta, id_the_loai, id_tac_gia)
values ('NỖI NIỀM CỦA THÁM TỬ GALILEO',167000,20,'http://static.nhanam.com.vn/thumb/0x320/crop/Books/Images/2023/9/6/GSEA8MAX.jpg','Một lá thư kỳ quái được gửi đến Sở cảnh sát Tokyo từ kẻ tự xưng "Bàn tay của ác ma" 
cảnh báo về một vụ giết người hàng loạt, đồng thời khiêu khích đích danh phó giáo sư Yukawa Manabu của đại học Teito. 
Mục đích nhắm đến Yukawa của tên tội phạm là gì, cách thức giết người đáng sợ vượt qua hiểu biết thông thường là gì? Yukawa từng tuyên bố sẽ không hợp tác với cảnh sát nay lại phải đương đầu với một vụ án cận kề. 
Cuốn thứ tư trong series Thám tử Galileo khắc họa cuộc quyết đấu giữa tên tội phạm quỷ quyệt và nhà vật lý thiên tài ở một quy mô vượt mọi hình dung.',1,2);

insert into sach(ma_san_pham, gia, so_luong, hinh_anh, mo_ta, id_the_loai, id_tac_gia)
values ('NGỤY CHỨNG CỦA SOLOMON',267000,10,'http://static.nhanam.com.vn/thumb/0x320/crop/Books/Images/2023/4/18/DRIPI7CD.jpg','Hai người bạn cùng lớp chết không rõ ràng. Giới truyền thông đưa tin đầy thiên kiến. 
Thầy cô bỏ mặc học sinh, tìm mọi cách để lấp liếm và xoa dịu tình hình. Ở thế giới bên kia, Kashiwagi
Takuya đang cất giữ bí mật gì? Khi tất cả còn chìm trong màn sương dối trá mịt mờ, làm sao chúng ta có thể ngang nhiên sống tiếp và tiến về phía trước?
Hãy cùng nhau tìm ra sự thật!
Theo lời kêu gọi của Fujino Ryoko, một “phiên tòa nội bộ trường” đã được lập ra bởi những học sinh đồng chí hướng, với mục đích duy nhất: truy tìm sự thật về cái chết của Kashiwagi Takuya.
Cuộc đọ sức nảy lửa giữa công tố viên và luật sư biện hộ bắt đầu…',1,3);

insert into sach(ma_san_pham, gia, so_luong, hinh_anh, mo_ta, id_the_loai, id_tac_gia)
values ('PHÍA SAU NGHI CAN X',100000,10,'http://static.nhanam.com.vn/thumb/0x320/crop/Books/Images/2019/5/23/ODQ5FV97.jpg','Khi nhấn chuông cửa nhà nghi can chính của một vụ án mới, 
điều tra viên Kusanagi không biết rằng anh sắp phải đương đầu với một thiên tài ẩn dật. 
Kusanagi càng không thể ngờ rằng, chỉ một câu nói vô thưởng vô phạt của anh đã kéo người bạn thân, Manabu Yukawa, 
một phó giáo sư vật lý tài năng, vào vụ án. Và điều làm sững sờ nhất, đó là vụ án kia chẳng qua cũng chỉ như một bài toán cấp ba đơn giản, 
tuy nhiên ấn số X khi được phơi bày ra lại không đem đến hạnh phúc cho bất cứ ai…
Với một giọng văn tỉnh táo và dung dị, Higashino Keigo đã đem đến cho độc giả hơn cả một cuốn tiểu thuyết trinh thám. 
Mô tả tội ác không phải điều hấp dẫn nhất ở đây, mà còn là những giằng xé nội tâm thầm kín, những nhân vật bình dị, và sự quan tâm sâu sa tới con người. 
Tác phẩm đã đem lại cho Higashino Keigo Giải Naoki lần thứ 134, một  giải thưởng văn học lâu đời sánh ngang giải Akutagawa tại Nhật.',1,4);

insert into sach(ma_san_pham, gia, so_luong, hinh_anh, mo_ta, id_the_loai, id_tac_gia)
values ('THÁM TỬ GÀ MỜ',150000,10,'http://static.nhanam.com.vn/thumb/0x320/crop/Books/Images/2017/9/23/8NFI5L2O.jpg','Kết hợp một chút hài hước kiểu Phá án sau bữa tối, 
rắc thêm nguyên liệu rùng rợn của Kindaichi, không quên mượn ông chú thám tử lừng danh lẩm cẩm từ Conan, 
Thám tử gà mờ chính là một nồi lẩu thập cẩm thú vị khiến cuốn người ta vào ngay từ trang đầu tiên, để rồi không thể rời mắt cho tới khi hết trang cuối cùng.',1,5);

insert into sach(ma_san_pham, gia, so_luong, hinh_anh, mo_ta, id_the_loai, id_tac_gia)
values ('TRĂM NĂM CÔ ĐƠN',199000,35,'http://static.nhanam.com.vn/thumb/0x320/crop/Books/Images/2023/12/7/8MKEH4NK.jpg',
'“Chỉ với một bước nhảy, Gabriel García Márquez đã vụt lên ngang hàng với Günter Grass và Vladimir Nabokov.”
- The New York Times
“Xuất sắc, hỗn độn, với tầm ảnh hưởng lớn ảnh…  Một thiên tiểu thuyết vĩ đại và đầy tính nhạc.”
- The Times',2,6);

insert into sach(ma_san_pham, gia, so_luong, hinh_anh, mo_ta, id_the_loai, id_tac_gia)
values ('ROMEO VÀ JULIET',199000,35,'http://static.nhanam.com.vn/thumb/0x320/crop/Books/Images/2023/9/11/C2HBAGKC.jpg',
'“Virgile đã sáng tạo ra người thiếu phụ yêu đương, Shakespeare đã sáng tạo ra người thiếu nữ yêu đương. Tất cả những thiếu phụ và thiếu nữ yêu đương khác chỉ là mô phỏng theo hai nhân vật Didon và Juliet.”- Flaubert
“Về hai mặt phóng túng và bạo nói, Shakespeare chẳng thua gì Rabelais.”
- Victor Hugo',2,7);

insert into sach(ma_san_pham, gia, so_luong, hinh_anh, mo_ta, id_the_loai, id_tac_gia)
values ('LÁ THƯ HÈ',146000,35,'http://static.nhanam.com.vn/thumb/0x320/crop/Books/Images/2023/7/18/FJFTJFCV.jpg',
'Chính Alphonse Daudet đã viết: “Đây chính là tác phẩm tôi thích nhất, không phải về phương diện văn chương mà bởi tác phẩm này đã nhắc tôi nhớ những giờ khắc đẹp đẽ nhất của tuổi trẻ, 
những trận cười điên cuồng, những phút say mê không hối tiếc, những bộ mặt, những bóng dáng bạn bè mà sau này tôi không còn gặp lại bao giờ.”
Vậy thì dành thời gian thưởng thức Lá thư hè khác nào một cách ngắn gọn nhất để hiểu về một trong những đại văn hào Pháp, và thêm nữa, 
bồi đắp nỗi hoài nhớ tuổi hoa niên vốn lắng đọng đâu đó trong mỗi con người chúng ta...',2,8);

insert into sach(ma_san_pham, gia, so_luong, hinh_anh, mo_ta, id_the_loai, id_tac_gia)
values ('CUỘC ĐỜI VÀ SỐ PHẬN',400000,25,'http://static.nhanam.com.vn/thumb/0x320/crop/Books/Images/2023/8/22/DZAS3YZS.jpg',
'Xoay quanh trận Stalingrad, trận chiến mang tính bước ngoặt trong Thế chiến Hai, Cuộc đời và Số phận muốn nắm bắt tinh thần của một thời đại bão tố mà nước Nga trải qua. 
Đó là một bức tranh mênh mông với đông đảo các nhân vật thuộc đủ mọi tầng lớp khiến sự chân thực của bức tranh ấy không chỉ đến những sự kiện lớn lao, 
những anh hùng thời đại quyết định vận mệnh của một dân tộc, mà còn đến từ những tình cảm, suy nghĩ nhỏ nhặt, những bi kịch tinh thần của mỗi cá nhân. 
Bức tranh nước Nga đó phong phú đa diện nhưng đồng thời vẫn hết sức nhất quán nhờ một câu hỏi đầy dằn vặt không ngừng trở đi trở lại: 
Làm thế nào con người có thể kháng cự quá trình phi nhân hóa, làm thế nào để có thể vừa sống sót vừa giữ được tính người trong cơn bão tố của lịch sử?',2,9);

insert into sach(ma_san_pham, gia, so_luong, hinh_anh, mo_ta, id_the_loai, id_tac_gia)
values ('TIẾNG KÈN THIÊN NGA',10000,35,'http://static.nhanam.com.vn/thumb/0x320/crop/Books/Images/2023/8/22/M4COSLFE.jpg',
'“Thiên nga thì phải vui tươi, không buồn bã; phong nhã, không vụng về; can trường, không hèn nhát.” 
Và nếu là thiên nga kèn, thì còn phải biết cất tiếng kêu tuýt! tuýt! thật mạnh mẽ, âm vang.
Trớ trêu thay, thiên nga kèn Louis lại không thể kêu tuýt! tuýt!, hay chíp!chíp!, hay phát ra bất kỳ âm thanh nào. 
Nhưng cũng may mắn làm sao, chú có một người mẹ nhạy cảm và thấu hiểu, một người cha sẵn sàng hy sinh cả tính mạng để tìm cho con trai mình một giọng nói. 
Và thêm ngàn lần may mắn, chú chính là… Louis, một thiên nga thông minh, nghị lực và đầy phẩm giá. Có hề gì nếu chú không thể cất tiếng kêu như đồng loại cơ chứ? 
Bởi giờ đây, bằng thứ âm nhạc truyền cảm phát ra từ cây kèn trumpet, thiên nga Louis giao tiếp với cả thế giới.',2,10);

insert into sach(ma_san_pham, gia, so_luong, hinh_anh, mo_ta, id_the_loai, id_tac_gia)
values ('TÔN TỬ BINH PHÁP',89000,29,'http://static.nhanam.com.vn/thumb/0x320/crop/Books/Images/2019/6/28/QGRGE9EW.jpg',
'Được xưng tụng là tuyệt tác binh thư hàng đầu của thế giới cổ đại, binh thư kinh điển vĩ đại nhất trong lịch sử nhân loại, Tôn Tử binh pháp là một cuốn cổ thư “kỳ quái”, 
“để trong vườn sẽ tỏa mùi thơm của hoa quý, ném xuống đất sẽ vang tiếng kêu của bạc vàng”. Nó không chỉ được các vua chúa từ đông sang tây xem như sách gối đầu giường, 
bí kíp quân sự không thể thiếu, mà còn được nhiều chuyên gia trong các lĩnh vực như triết học, kinh doanh, tâm lý học, ngôn ngữ học, thể dục thể thao…
ứng dụng để nghiên cứu và đạt được nhiều thành tựu đáng kể.
Tôn Tử binh pháp với văn từ gọn ghẽ, nghĩa lý sâu xa, âm điệu bay bổng, nhờ đó sức lan tỏa và tầm ảnh hưởng của 
“thánh điển binh học” này vô cùng rộng lớn, được dịch ra trên 100 thứ tiếng và xuất bản hầu khắp trên toàn thế giới. ',2,11);

insert into sach(ma_san_pham, gia, so_luong, hinh_anh, mo_ta, id_the_loai, id_tac_gia)
values ('ĐIỀM LÀNH - NHỮNG LỜI TIÊN TRI TUYỆT ĐÍCH VÀ CHUẨN XÁC CỦA PHÙ THỦY AGNES NUTTER',220000,40,'http://static.nhanam.com.vn/thumb/0x320/crop/Books/Images/2022/12/13/V5VL3E5N.jpg',
'Quỷ Crowley và thiên thần Aziraphale biết rằng Tận Thế sắp sửa đến với thế giới này, với sự giáng lâm của Kẻ Chống Chúa trong hình hài đứa trẻ sơ sinh. 
Đáng lẽ cả hai phải lấy làm sung suớng: cuộc chiến tối hậu giữa thiên đường và địa ngục, dù phe nào thắng, thì cũng sẽ hủy diệt thế giới này, 
kết thúc cuộc giằng co hàng thiên niên kỷ giữa Thiện và Ác. Nhưng khốn nỗi, cả Crowley và Aziraphale lại thấy nuối tiếc thế giới của nhân loại. 
Thế giới con người vừa nhếch nhác, ngu xuẩn, lại vừa độc địa, thế nhưng nó cũng thú vị ghê gớm, 
đến nổi viễn cảnh phải sống ở một nơi toàn địa ngục hay toàn thiên đường trở nên không thể chịu đựng nổi với cả hai. 
Thiên thần và ác quỷ cùng tham gia vào một mưu đồ vừa khôn ngoan, vừa dớ dẩn, để cứu thế giới khỏi họa diệt vong.',2,12);

-- --2-- 
insert into sach(ma_san_pham, gia, so_luong, hinh_anh, mo_ta, id_the_loai, id_tac_gia)
values ('GIẾT CON CHIM NHẠI',96000,30,'https://icdn.dantri.com.vn/a3HWDOlTcvMNT73KRccc/Image/2014/07/45-8768d.jpg','Giết con chim nhại” vừa ấm áp, hài hước, vừa dữ dội, thấm thía.
Nó đề cập tới những vấn đề nghiệt ngã của đời sống xã hội, như nạn phân biệt chủng tộc, tội ác, trừng phạt, sự bất công, lẽ công bằng…
Đây là cuốn tiểu thuyết được tìm đọc nhiều nhất, gây ảnh hưởng và có tiếng vang lớn nhất khi đề cập tới nạn phân biệt chủng tộc từng một thời diễn ra trên khắp nước Mỹ.
Để hiểu được sự bất công, độc ác của con người và cũng để tìm được niềm tin vào những điều tốt đẹp trong cuộc sống, “Giết con chim nhại” là lựa chọn hoàn hảo.
“Phần lớn mọi người đều tốt cả, con ạ, chỉ có điều con chưa nhận ra đấy thôi”, câu nói của vị luật sư ngay thẳng, của người cha nhân hậu Atticus đã từng làm xúc động biết bao trái tim độc giả khi khép lại trang cuối cùng của cuốn tiểu thuyết.
',1,13);
insert into sach(ma_san_pham, gia, so_luong, hinh_anh, mo_ta, id_the_loai, id_tac_gia)
values ('VỤ ÁN',144000,25,'https://icdn.dantri.com.vn/a3HWDOlTcvMNT73KRccc/Image/2014/07/46-8768d.jpg','Vụ án” là một trong những
tác phẩm nổi tiếng nhất của Kafka. Cuốn tiểu thuyết kể về một người đàn ông bị bắt và bị khởi tố bởi một thứ chính quyền, tòa án và luật pháp kỳ lạ,
không thể hiểu nổi. Bản thân tội ác mà nhân vật nam chính phạm phải (nếu có) cũng không được hé lộ cho chính anh ta và độc giả được biết.
Toàn bộ câu chuyện diễn ra vừa hiện thực vừa hư ảo như thể một cơn ác mộng, hư hư thực thực và đầy rẫy kinh hoàng, trong đó nhân vật chính bất lực hoàn toàn,
chẳng có chút sức mạnh hay bất cứ một đầu mối nào để có thể thoát ra khỏi tấn bi kịch hãi hùng đã bóp chết anh ta.
Giống như phần lớn những tác phẩm khác của mình, tiểu thuyết này của Kafka cũng chưa được hoàn thành, tạo nên sự không liền mạch,
thậm chí mâu thuẫn trong cốt truyện. Điều đó càng làm nổi bật lên chủ nghĩa hiện sinh trong tác phẩm, nhấn mạnh sự mất định hướng
khi đứng trước một thế giới có vẻ như vô nghĩa và phi lý.',1,14);
insert into sach(ma_san_pham, gia, so_luong, hinh_anh, mo_ta, id_the_loai, id_tac_gia)
values ('BẮT TRẺ ĐỒNG XANH',79200,15,'https://icdn.dantri.com.vn/a3HWDOlTcvMNT73KRccc/Image/2014/07/47-8768d.jpg','Cuốn tiểu thuyết “Bắt trẻ đồng xanh” ban đầu được
tác giả J.D. Salinger viết cho người lớn, tuy vậy, về sau, cuốn tiểu thuyết này lại trở nên nổi tiếng và rất được giới thanh thiếu niên ưa thích bởi chủ đề của nó
xoay quanh sự nổi loạn và nét tâm lý thách thức rất đặc trưng ở tuổi trẻ.
Nhân vật chính của tiểu thuyết - cậu thanh niên Holden Caulfield - đã trở thành biểu tượng cho sự phản kháng thường thấy ở những con người trẻ tuổi mới chập chững bước vào cuộc đời.
Truyện đã khai thác rất sâu kỹ tâm lý và những vấn đề phức tạp ở lứa tuổi này: cá tính riêng, sự phức tạp của những mối quan hệ, cảm giác gắn bó và sự xa cách…
',1,15);
insert into sach(ma_san_pham, gia, so_luong, hinh_anh, mo_ta, id_the_loai, id_tac_gia)
values ('ANH EM NHÀ KARAMAZOV',174000,20,'https://icdn.dantri.com.vn/a3HWDOlTcvMNT73KRccc/Image/2014/07/48-8768d.jpg','Đây là cuốn tiểu thuyết cuối cùng của Dostoevsky. Ông đã dành ra gần 2 năm để viết nên tác phẩm này - một cuốn tiểu thuyết đậm chất triết lý, lấy bối cảnh nước Nga ở thế kỷ 19. Tiểu thuyết đi sâu khai thác đề tài đạo đức, luân lý, tù ngục và sự tự do trong lý tưởng.
“Anh em nhà Karamazov” chứa đựng những cuộc đấu tranh của đạo đức trong đó đức tin, sự ngờ vực và lẽ phải đối diện với sự đổi thay của thời thế, trước một nước Nga đang dần chuyển mình. Cho tới tận hôm nay, cuốn tiểu thuyết này vẫn là một trong những tác phẩm văn học kinh điển, một trong những thành tựu lớn lao nhất của nền văn học thế giới.
',1,16);
insert into sach(ma_san_pham, gia, so_luong, hinh_anh, mo_ta, id_the_loai, id_tac_gia)
values ('HỎA NGỤC',11000,10,'https://sachhay24h.com/uploads/images/hoa-nguc-dan-brown.jpg','Nhắc đến những cuốn tiểu thuyết trinh thám nổi tiếng trên thế giới, chắc chắn chúng ta không thể bỏ qua một tác phẩm cực kì nổi tiếng đó là Hoả Ngục của nhà văn người Mỹ Dan Brown.
Được xuất bản vào năm 2013, Hỏa ngục đã thực sự tạo được dấu ấn sâu sắc trong lòng độc giả và trở thành một trong những cuốn tiểu thuyết bán chạy nhất trên danh sách New York Times Best Seller.
Tác phẩm ngay từ khi xuất bản đã thu về doanh thu rất cao, cũng như được dịch ra nhiều thứ tiếng khác nhau trên thế giới. Đồng thời, tác phẩm cũng được chuyển thể thành phim và dự kiến chiếu vào tháng 4 năm 2016.
Nhắc đến những cuốn tiểu thuyết trinh thám nổi tiếng trên thế giới, chắc chắn chúng ta không thể bỏ qua một tác phẩm cực kì nổi tiếng đó là Hoả Ngục của nhà văn người Mỹ Dan Brown.
Được xuất bản vào năm 2013, Hỏa ngục đã thực sự tạo được dấu ấn sâu sắc trong lòng độc giả và trở thành một trong những cuốn tiểu thuyết bán chạy nhất trên danh sách New York Times Best Seller.
Tác phẩm ngay từ khi xuất bản đã thu về doanh thu rất cao, cũng như được dịch ra nhiều thứ tiếng khác nhau trên thế giới.
Đồng thời, tác phẩm cũng được chuyển thể thành phim và dự kiến chiếu vào tháng 4 năm 2016.
',2,17);
insert into sach(ma_san_pham, gia, so_luong, hinh_anh, mo_ta, id_the_loai, id_tac_gia)
values ('SỰ IM LẶNG CỦA BẦY CỪU ',172000,30,'https://sachhay24h.com/uploads/images/2020/T5/469/su-im-lang-cua-bay-cuu.PNG',
'Nếu bạn là một người yêu thích tiểu thuyết trinh thám thì chắc chắn không thể bỏ qua được tiểu thuyết Sự im lặng của bầy cừu của Thomas Harris.
Đây là một tác phẩm trinh thám xen lẫn yếu tố kinh dị, với việc miêu tả tâm lí nhân vật hết sức tinh tế cùng những tình tiết truyện gay cấn và hồi hộp, cuốn tiểu thuyết đã  tạo ấn tượng rất đặc biệt trong lòng người đọc.
Sự im lặng của bầy cừu là câu chuyện đầy gay cấn và hấp dẫn kể về hàng loạt vụ án giết người xảy ra nhưng không để lại bất kỳ một dấu vết gì.
Tuy nhiên có một bác sĩ tâm lý bị tâm thần có tên là Lecter lại rõ về hành vi của kẻ sát nhân nhưng không hiểu sao ông chỉ im lặng.
Cuối cùng thì sự thật cũng đã phơi bày,  thủ phạm của hàng loạt vụ án giết người là một tên có nhân cách bệnh hoạn, một kẻ tâm thần vô cùng nguy hiểm
',2,18);
insert into sach(ma_san_pham, gia, so_luong, hinh_anh, mo_ta, id_the_loai, id_tac_gia)
values ('ĐỀ THI ĐẪM MÁU',14000,30,'https://sachhay24h.com/uploads/images/2019/11/1/25/de-thi-dam-mau-1_600x877.jpg',
'Với những vụ án rùng rợn, kinh dị và khủng khiếp qua ngòi bút sắc bén của tác giả Lôi Mễ, “Đề thi đẫm máu” đã trở thành một trong những cuốn tiểu thuyết trinh thám nổi tiếng nhất trên thế giới thu hút được sự quan tâm của hàng triệu độc giả.
Ám ảnh, sợ hãi và bất ngờ, đó là những gì gói gọn trong tác phẩm trinh thám Đề thi đẫm máu nổi tiếng của tác giả Lôi Mễ. Những vụ án ly kì, hậu quả cực kì nghiêm trọng; tên sát nhân với thủ đoạn tàn nhẫn, giết người ghê rợn đều được thể hiện hết sức sinh động qua ngòi bút sắc bén của Lôi Mễ.
Nội dung cuốn tiểu thuyết kể về nhân vật chính là một chàng trai vô cùng thông minh có tên là Phương Mộc.
Anh chàng này có khả năng thiên bẩm là khắc họa chân dung tội phạm rất chính xác nên giúp đỡ cảnh sát nhiều trong việc phá án những vụ án giết người nguy hiểm.
Rồi có những sự việc gì xảy ra tiếp theo, tại sao thầy giáo Tôn, người đã ra đề thi đẫm máu và nước mắt cho anh và những người thân bên cạnh anh lần lượt ra đi.
Hãy theo dõi cuốn sách để tìm hiểu sự thật đằng sau những cái chết bí hiểm đó nhé.
Vốn là một sĩ quan cảnh sát, thế nên cách phát triển tâm lí tội phạm, cách miêu tả những tình tiết trong các vụ án đều được Lôi Mễ diễn tả một cách vô cùng chân thực và logic. Các sự việc xâu chuỗi vào nhau, tạo nên mạch truyện rất hợp lí. Gấp lại trang cuối cùng, chắc chắn đọng lại trong chúng ta không những là cảm giác ám ảnh về những vụ án khủng khiếp, mà còn là những trăn trở, suy nghĩ về tâm lí nhân vật, về những triết lí sống mà cuốn tiểu thuyết trinh thám đặc sắc này đã để lại.
',2,19);
insert into sach(ma_san_pham, gia, so_luong, hinh_anh, mo_ta, id_the_loai, id_tac_gia)
values ('VÒNG TRÒN MÁU ',115000,25,'https://sachhay24h.com/uploads/images/tieu-thuyet-trinh-tham-vong-tron-mau.jpg',
'Vòng tròn máu là một trong những tiểu thuyết xuất sắc làm nên tên tuổi của Edgar Wallace.
Xuất bản năm 1922, ngay lập tức tiểu thuyết trinh thám “Vòng tròn máu” đã tạo nên tiếng vang lớn tại Châu Âu, mở đường cho tác giả của nó - nhà văn Edgar Wallace, trở thành một trong những tác giả có số lượng ấn phẩm được bán nhiều nhất trên thế giới, với hơn 200 triệu bản.
Triệu phú James Beaardmore nhận được thư tống tiền từ tổ chức VÒNG TRÒN MÁU nhưng ông vẫn cương quyết không chịu nhượng bộ, dù đó là "lời cảnh cáo cuối cùng".
Ngày hôm sau, ông bị sát hại ngay sau nhà. Bầu không khí hoang mang bao trùm khắp nước Anh, khi ngày càng có nhiều người thuộc tầng lớp thượng lưu giàu có lần lượt nhận được những lá thư đóng dấu tròn đỏ với cùng một yêu cầu: NỘP NGƯỜI HAY NỘP MẠNG. Cảnh sát bắt đầu vào cuộc điều tra, tìm ra manh mối của VÒNG TRÒN MÁU.
Bên cạnh các yếu tố li kì, hấp dẫn với nhịp chuyện dồn dập diễn ra liên tục cùng với tiết tấu truyện nhanh giúp độc giả cảm giác hồi hộp, gay cấn trong cuộc đối đầu giữa cảnh sát với trùm cuối của Vòng tròn máu.
Wallace đã xây dựng một hệ thống nhân vật với cá tính riêng chỉ qua một vài chi tiết, hành động mà không sa đà quá vào cá nhân dẫn tới xao lãng mạch phá án chính. Đặc biệt phần cuối, twist hay nhất trong cả câu chuyện, nó đánh lạc hướng hoàn toàn dẫn dắt từ ban đầu của tác giả. Vòng tròn máu là tiểu thuyết trinh thám nổi tiếng bậc nhất của Edgar Wallace và đã 4 lần được dựng thành phim.
',2,20);
insert into sach(ma_san_pham, gia, so_luong, hinh_anh, mo_ta, id_the_loai, id_tac_gia)
values ('ĐÁNH THỨC CON NGƯỜI PHI THƯỜNG TRONG BẠN',20000,30,'https://images.toplist.vn/images/800px/danh-thuc-con-nguoi-phi-thuong-trong-ban-706687.jpg',
'Cuốn sách “Đánh thức con người phi thường trong bạn” được viết bởi Anthony Robbins – một tác giả, diễn giả và nhà thiện nguyện nổi tiếng người Mỹ, xuất bản năm 1991.
Tác phẩm hướng đến việc giúp người đọc khám phá và phát triển tiềm năng tiềm ẩn bên trong, nhằm xây dựng cuộc sống mơ ước. Với 26 chương, cuốn sách này được xây dựng
dựa trên các phương pháp thực tế để làm chủ cảm xúc, quản lý mối quan hệ, quản lý tài chính và áp dụng các câu danh ngôn sâu sắc. Anthony Robbins
tổng hợp những nghiên cứu và kinh nghiệm cá nhân của mình thành một hướng dẫn mạch lạc, giúp độc giả đạt được sự tự chủ và thành công trong mọi khía cạnh của cuộc sống.',3,21);
insert into sach(ma_san_pham, gia, so_luong, hinh_anh, mo_ta, id_the_loai, id_tac_gia)
values ('NGHỆ THUẬT TINH TẾ CỦA VIỆC ĐẾCH QUAN TÂM CUỐN SÁCH ',150000,20,'https://salt.tikicdn.com/cache/750x750/ts/product/e4/9b/b7/a8b3f9dfdd6a8eef63f20b7646c976d8.jpg.webp',
'Nghệ thuật tinh tế của việc đếch quan tâm” của Mark Manson không hướng dẫn chúng ta cách đạt đến thành công như nhiều cuốn sách kỹ năng khác.
Thay vào đó, tác giả tập trung vào việc giúp chúng ta học cách buông bỏ những thứ cần buông và tập trung quan tâm vào những điều quan trọng.
Không phải “đếch quan tâm” đồng nghĩa với sự thờ ơ hay bỏ mặc mọi thứ.
Thực tế, ý nghĩa ở đây là giữ cho tâm trạng bình thản, không mệt mỏi và chỉ quan tâm đến những điều có giá trị, hỗ trợ sự phát triển cá nhân..',3,22);
insert into sach(ma_san_pham, gia, so_luong, hinh_anh, mo_ta, id_the_loai, id_tac_gia)
values ('ĐỜI NGẮN ĐỪNG NGỦ DÀI',195000,40,'https://jobsgo.vn/blog/wp-content/uploads/2023/11/Sach-Self-Help-La-Gi.jpg',
'Đây là một cuốn sách nổi tiếng của tác giả Robin Sharma. Cuốn sách này mang đến những chia sẻ sâu sắc về cách chúng ta có thể sống một cuộc sống đầy ý nghĩa và có ảnh hưởng tích cực đến thế giới xung quanh.
“Đời ngắn đừng ngủ dài” không chỉ là một cuốn sách về làm giàu về mặt vật chất mà còn là hành trình để khám phá sứ mệnh cá nhân và định hình một cuộc sống có ý nghĩa.
Cuốn sách xoay quanh các chủ đề như quản lý thời gian, xây dựng thói quen tích cực và khám phá đam mê cá nhân.
Robin Sharma thường sử dụng lối viết lôi cuốn và ngôn ngữ đơn giản, giúp độc giả dễ dàng áp dụng những nguyên tắc này vào cuộc sống hàng ngày.',3,23);
insert into sach(ma_san_pham, gia, so_luong, hinh_anh, mo_ta, id_the_loai, id_tac_gia)
values ('BÍ MẬT',166000,20,'https://jobsgo.vn/blog/wp-content/uploads/2023/11/sach-self-help-nen-doc.jpg',
'Cuốn sách “Bí mật” được xuất bản vào năm 2006 và nhanh chóng trở thành một tác phẩm nổi tiếng trong thể loại self help.
Tác giả Rhonda Byrne chia sẻ về khái niệm “luật hấp dẫn” – một điều mà cô coi là bí mật của sự thành công.
Theo quan điểm của Byrne, luật hấp dẫn không chỉ là một phát minh khoa học mà còn là một quy luật tinh tế trong cuộc sống.
Cuốn sách khẳng định rằng những điều mà bạn tập trung vào sẽ trở thành hiện thực, dù đó là tích cực hay tiêu cực.
Tác giả cũng nhấn mạnh rằng tiền bạc, hạnh phúc và sức khỏe có thể đạt được thông qua tư duy tích cực.
“Bí mật” thúc đẩy độc giả luôn giữ tâm trạng lạc quan và tin rằng việc điều chỉnh vũ trụ với những mong muốn tích cực là chìa khóa cho cuộc sống hạnh phúc, thành công.',3,24);

-- --3
insert into sach( ma_san_pham, gia, so_luong, hinh_anh, mo_ta, id_the_loai, id_tac_gia)
values 
('Cho tôi biết tại sao',300000,65,'https://images-na.ssl-images-amazon.com/images/S/compressed.photo.goodreads.com/books/1582695112i/51783343.jpg','Daylesford đẹp như tranh vẽ có một mặt tối hơn. Nhà văn Georgie Harvey ở Melbourne đến vùng suối khoáng ở miền trung Victoria để tìm kiếm một người nông dân mất tích và nhanh chóng liên kết vụ mất tích của người phụ nữ với bí ẩn chưa được giải đáp xung quanh chồng cô. 
Trong khi đó, viên cảnh sát lập dị và người cha đơn thân John Franklin đang điều tra một vụ án khác xa với tội phạm nhẹ thường thấy của Daylesford: kẻ theo dõi nhắm vào các bà mẹ đơn thân. 
Cuộc điều tra của Georgie khơi dậy những bí mật bị chôn vùi từ lâu và thu hút kẻ thù. Khi cô báo cáo người mất tích cho cảnh sát địa phương, tia lửa đã bay giữa cô và Franklin. 
Phải chăng ông đã sa thải nhà văn quá nhanh? Và sự thật sẽ có giá bao nhiêu?',1,25);
insert into sach( ma_san_pham, gia, so_luong, hinh_anh, mo_ta, id_the_loai, id_tac_gia)
values
('Người điều tra miễn cưỡng',250000,63,'https://images-na.ssl-images-amazon.com/images/S/compressed.photo.goodreads.com/books/1524539633i/39930911.jpg','Fenway Stevenson không muốn quay trở lại thị trấn ven biển nơi người cha ghẻ lạnh của cô trên thực tế là vua. 
Nhưng cái chết của mẹ cô đã kéo cô trở về nhà và vụ sát hại nhân viên điều tra của quận đã lôi kéo cô vào một âm mưu ngày càng sâu sắc. 
Khi số lượng thi thể tăng lên và mọi dấu hiệu dường như đều hướng về công ty dầu mỏ của cha cô, liệu Fenway có khám phá ra sự thật trước khi mối quan hệ gia đình trở nên nguy hiểm?',1,26);

INSERT INTO sach( ma_san_pham, gia, so_luong, hinh_anh, mo_ta, id_the_loai, id_tac_gia) VALUES ( 'Vụ giết người ở tynesside', '280000', '34', 'https://images-na.ssl-images-amazon.com/images/S/compressed.photo.goodreads.com/books/1582893076i/51870417.jpg', 'Agnes Lockwood góa vợ gần đây đang dành vài ngày ở Tyneside ở Đông Bắc nước Anh để ôn lại quá khứ của mình. Khi đồ trang sức đắt tiền bị đánh cắp tại khách sạn, Chánh thanh tra Alan Johnson vào cuộc.', '1', '27');
INSERT INTO sach( ma_san_pham, gia, so_luong, hinh_anh, mo_ta, id_the_loai, id_tac_gia) VALUES ( 'Mảnh ghép bí ẩn', '120000', '68', 'https://m.media-amazon.com/images/I/71IgDMCVvmL._AC_UF1000,1000_QL80_.jpg', 'Giữa việc hoàn thành tấm bằng sinh học, chăm sóc cháu trai và bắt đầu công việc mới tại cửa hàng đồ cổ trong khi chảy nước miếng trước cậu con trai xinh đẹp của người chủ, Aly không có thời gian để tưởng tượng. Nhưng khi khách hàng cáu kỉnh Earl bị giết và ông chủ mới của Aly, Olive là nghi phạm chính, cô phải sử dụng sức mạnh mới tìm được của mình để cứu người duy nhất hiểu được những món quà của Aly. Ai ghét Earl đến mức giết chết? Cảnh sát thà bắt giữ nhanh chóng hơn là điều tra, vì vậy việc xóa tên của Olive là tùy thuộc vào Aly.', '1', '28');
INSERT INTO sach( ma_san_pham, gia, so_luong, hinh_anh, mo_ta, id_the_loai, id_tac_gia) VALUES ( 'Cuộc phiêu lưu của Alice ở xứ sở thần tiên', '350000', '120', 'https://cdn-amz.woka.io/images/I/91MFVwBsxjL.jpg', 'Alice của Lewis Carroll đã mê hoặc trẻ em suốt 150 năm. Alice tò mò, Thỏ trắng hống hách, Nữ hoàng trái tim đáng gờm và Mad Hatter là một trong những tác phẩm văn học mang tính biểu tượng, được yêu thích nhất mọi thời đại. Macmillan là nhà xuất bản ban đầu của Alice vào năm 1865 và tự hào luôn giữ đúng tầm nhìn của những người sáng tạo ra nó. Những hình ảnh minh họa đáng chú ý của Sir John Tenniel đều mang tính biểu tượng, thể hiện hoàn hảo sự kết hợp giữa điều bình thường và điều phi thường ở trung tâm của Wonderland.', '2', '29');
INSERT INTO sach( ma_san_pham, gia, so_luong, hinh_anh, mo_ta, id_the_loai, id_tac_gia) VALUES ( 'Bắt cóc', '150000', '160', 'https://robert-louis-stevenson.org/wp-content/uploads/kidnapped2-225x300.jpg', 'Đầy tinh thần, lãng mạn và đầy nguy hiểm, Kidnapped là tác phẩm kinh điển về phiêu lưu mạo hiểm của Robert Louis Stevenson. Được nhiều thế hệ yêu mến, đó là câu chuyện về David Balfour, một người thừa kế trẻ tuổi có người chú tham lam đồng mưu giết anh ta bằng tài sản thừa kế và âm mưu bắt anh ta và bán làm nô lệ. Nhưng danh dự, lòng trung thành và lòng dũng cảm sẽ được khen thưởng; đứa trẻ mồ côi và bị bỏ rơi sống sót sau vụ bắt cóc và đắm tàu, được giải cứu bởi một kẻ lừa đảo liều lĩnh và thực hiện một cuộc trốn thoát ly kỳ để tìm tự do trên khắp vùng cao nguyên hoang dã của Scotland.', '2', '30');
INSERT INTO sach( ma_san_pham, gia, so_luong, hinh_anh, mo_ta, id_the_loai, id_tac_gia) VALUES ('Anne of Green Gables', '200000', '98', 'https://cdn0.fahasa.com/media/catalog/product/a/n/anne_of_green_gables_vintage_classics_1_2020_04_29_13_33_41.jpg', 'Điều tôi không thích: Là một đứa trẻ mồ côi, có mái tóc đỏ, mọi người bàn tán về mái tóc đỏ của tôi, bị Gilbert Blythe gọi là \"củ cà rốt\". Sở thích của tôi: Sống ở Chái Nhà Xanh với Marilla và Matthew Cuthbert, Diana, bạn thân của tôi, mặc váy tay phồng, đổi tên ao của Barry thành Hồ Nước Lấp Lánh, đứng đầu lớp. Điều hối tiếc của tôi: Nhuộm tóc màu xanh lá cây. Đập một phiến đá lên đầu Gilbert Blythe. Ước mơ của tôi: Chế ngự tính nóng nảy của mình. Để trở nên tốt (đây là một cuộc đấu tranh khó khăn). Lớn lên có mái tóc màu nâu vàng!', '2', '31');
INSERT INTO sach( ma_san_pham, gia, so_luong, hinh_anh, mo_ta, id_the_loai, id_tac_gia) VALUES ( '451 độ F', '200000', '36', 'https://m.media-amazon.com/images/I/71X0Wsoa+vL._AC_UF1000,1000_QL80_.jpg', 'Guy Montag là lính cứu hỏa. Công việc của anh ta là tiêu hủy những mặt hàng bất hợp pháp nhất, sách in, cùng với những ngôi nhà nơi chúng được cất giấu. Montag không bao giờ đặt câu hỏi về sự tàn phá và hủy hoại mà hành động của anh tạo ra, mỗi ngày trở lại với cuộc sống nhạt nhẽo của anh và người vợ, Mildred, người dành cả ngày cho “gia đình” truyền hình của cô. Nhưng khi anh gặp một người hàng xóm trẻ tuổi lập dị, Clarisse, người đã giới thiệu cho anh về quá khứ nơi con người không sống trong sợ hãi và về hiện tại nơi người ta nhìn thế giới qua những ý tưởng trong sách thay vì những cuộc trò chuyện vô nghĩa trên tivi, Montag bắt đầu hỏi tất cả những gì anh từng biết.', '2', '32');
INSERT INTO sach( ma_san_pham, gia, so_luong, hinh_anh, mo_ta, id_the_loai, id_tac_gia) VALUES ('Nhà giả kim', '250000', '99', 'https://m.media-amazon.com/images/W/MEDIAX_792452-T2/images/I/51bVNTqHFlL._AC_UF1000,1000_QL80_.jpg', 'Kết hợp phép thuật, sự huyền bí, trí tuệ và điều kỳ diệu thành một câu chuyện đầy cảm hứng về sự khám phá bản thân, Nhà giả kim đã trở thành một tác phẩm kinh điển hiện đại, bán được hàng triệu bản trên khắp thế giới và thay đổi cuộc sống của vô số độc giả qua nhiều thế hệ.', '3', '33');
INSERT INTO sach( ma_san_pham, gia, so_luong, hinh_anh, mo_ta, id_the_loai, id_tac_gia) VALUES ( 'Thay đổi tí hon hiệu quả bất ngờ', '130000', '25', 'https://m.media-amazon.com/images/W/MEDIAX_792452-T2/images/I/81YkqyaFVEL._AC_UF1000,1000_QL80_.jpg', 'Bất kể mục tiêu của bạn là gì, Atomic Habits đều cung cấp một khuôn khổ đã được chứng minh để cải thiện--hàng ngày. James Clear, một trong những chuyên gia hàng đầu thế giới về hình thành thói quen, tiết lộ những chiến lược thực tế sẽ dạy bạn chính xác cách hình thành thói quen tốt, từ bỏ thói quen xấu và làm chủ những hành vi nhỏ dẫn đến kết quả đáng chú ý.', '3', '34');
INSERT INTO sach( ma_san_pham, gia, so_luong, hinh_anh, mo_ta, id_the_loai, id_tac_gia) VALUES ( 'Suy nghĩ nhanh và chậm', '120000', '32', 'https://salt.tikicdn.com/cache/w1200/ts/product/05/a9/0e/fa26cefb7aa153467118665da97e90ab.png', 'Hệ thống 1 nhanh, trực quan và giàu cảm xúc; Hệ thống 2 chậm hơn, cân nhắc hơn và logic hơn. Tác động của sự tự tin thái quá lên các chiến lược của công ty, những khó khăn trong việc dự đoán điều gì sẽ khiến chúng ta hạnh phúc trong tương lai, tác động sâu sắc của những thành kiến nhận thức lên mọi thứ, từ chơi thị trường chứng khoán đến lên kế hoạch cho kỳ nghỉ tiếp theo của chúng ta – mỗi điều này chỉ có thể được hiểu bằng cách biết cách thực hiện. hai hệ thống định hình các phán đoán và quyết định của chúng ta.', '3', '35');
INSERT INTO sach( ma_san_pham, gia, so_luong, hinh_anh, mo_ta, id_the_loai, id_tac_gia) VALUES ( 'Bốn thỏa thuận', '320000', '78', 'https://m.media-amazon.com/images/W/MEDIAX_792452-T2/images/I/81hHy5XrdKL._AC_UF1000,1000_QL80_.jpg', '“Cuốn sách này của Don Miguel Ruiz, đơn giản nhưng rất mạnh mẽ, đã tạo ra sự khác biệt to lớn trong cách tôi suy nghĩ và hành động trong mọi cuộc gặp gỡ.” —Oprah Winfrey', '3', '36');


-- 4-- 
insert into sach(ma_san_pham, gia, so_luong, hinh_anh, mo_ta, id_the_loai, id_tac_gia)
values('Thiên Thần Và Ác Quỷ',  239000, 20, 'https://salt.tikicdn.com/cache/w1200/ts/product/70/25/41/034b7f4e2706fedb8f94406bc9b1d20e.jpg',
'Robert Langdon, giáo sư biểu tượng học của Harvard, được bí mật mời tới Trung tâm nghiên cứu Hạt nhân châu Âu - cơ quan nghiên cứu khoa học lớn nhất thế giới để làm sáng tỏ cái chết của nhà vật lý học Leonardo Vetra. 
Biểu tượng bí ẩn được đóng dấu sắt nung trên ngực thi thể đưa đến một kết luận duy nhất: Hung thủ chính là Illuminati - một hội kín tưởng chừng đã tàn lụi từ 400 năm trước. 
Dường như hội kín vô cùng quyền lực này đã trở lại để tiếp tục cuộc báo thù nhằm vào Nhà thờ Công giáo, kẻ thù truyền kiếp của mình.',1, 37);

insert into sach(ma_san_pham, gia, so_luong, hinh_anh, mo_ta, id_the_loai, id_tac_gia)
values('Kasha', 109000, 20, 'https://down-vn.img.susercontent.com/file/2b9a43b51d9f2a9262e7ca81efd4caf6',
'KASHA kết hợp cả hai ý tưởng này, kể về một thứ yêu quái mang dáng hình đàn bà, chuyên vun xới đời mình trên xác tàn của kẻ khác. Chỉ chăm chăm nhảy vào cỗ xe lửa của thi hài, mà không hay mình đang thay thi hài đến nơi ngục hình chịu tội.', 1, 38);

insert into sach(ma_san_pham, gia, so_luong, hinh_anh, mo_ta, id_the_loai, id_tac_gia)
values('Thôn Tám Mộ', 135000, 30, 'https://product.hstatic.net/200000287623/product/thon_tam_mo_-_bia_1_2e377c88c426414fa1abc4e29a91df0a_master.jpg',
'Kết thúc Thế chiến 2, Tatsuya xuất ngũ về lại thành phố quê hương, không còn người thân, không xu dính túi, công việc bấp bênh. Bất thần anh nghe trên đài phát tin gia đình giàu có thất lạc từ lâu đang tìm mình.
Tatsuya bèn đến nơi gửi tin, gặp được người thân đầu tiên chừng vài phút thì người này mất mạng trước mắt anh.
Tatsuya về thôn làng mình chào đời, sang hôm sau thì người thân thứ hai mất mạng trước mắt anh.
Sau đó, cứ một vài hôm lại thêm một người mất mạng trước mắt Tatsuya. Anh nghiễm nhiên biến thành kẻ tình nghi lớn nhất, thành kẻ gieo rắc tai ương trong thôn. Tatsuya đi từ ngạc nhiên đến kinh hoàng, khi phát hiện ra đây là nhân quả của tội nghiệt do tổ tiên mình để lại. 
Chẳng là gần bốn trăm năm trước, có tám samurai mang vàng đến đây lánh nạn đã bị tổ tiên anh dẫn thôn dân đến bao vây hạ sát. Trước khi bị chặt đầu, vị thủ lĩnh samurai đã nguyền rằng sẽ ếm nguyền bảy đời cho thôn này không thể sống yên ổn.
Từ đó cho đến tận đời cha anh, mỗi thế hệ trong thôn đều xảy ra một vụ thảm sát, số nạn nhân đều là bội số của 8, như thể lấy mạng để đền tội cho tám samurai chết oan thuở nào.', 1, 39);

insert into sach(ma_san_pham, gia, so_luong, hinh_anh, mo_ta, id_the_loai, id_tac_gia)
values('Kẻ Nặn Sáp', 115000, 20, 'https://product.hstatic.net/200000287623/product/ke-nan-sap_f80570308a5142ffa60a6586e1102a96_master.jpg',
'Mẹ tôi luôn nói, không bao giờ được tin một người đàn ông có dái tai nằm thấp hơn khuôn miệng. Đó là dấu hiệu của bọn tội phạm. Nhìn ông ta xem.
Rất nhiều nhận định nghe đáng ngờ và đầy cảm tính như thế lại tồn tại sắt đá khắp câu chuyện này, giăng lên mê lộ khiến không những độc giả mà chính các nhân vật cũng phải bối rối và lạc đường trên hành trình đi tìm thật-giả.
Cách đây bốn năm, một cô gái trẻ bị kết án sát nhân, khi người ta tìm thấy thi thể mẹ và em cô giữa thảm máu lênh láng trên sàn bếp, được chặt thành từng mảnh rồi ráp lại, nhưng có lẽ do loạn trí, một số mảnh đã bị ráp nhầm từ người nọ sang người kia.', 1, 40);

insert into sach(ma_san_pham, gia, so_luong, hinh_anh, mo_ta, id_the_loai, id_tac_gia)
values('Mê Cung Đỏ',99000,20,'https://salt.tikicdn.com/cache/w400/media/catalog/product/b/i/bia-me-cung-do.u547.d20161201.t084238.859110.jpg',
'Con người ta luôn luôn đòi hỏi những câu chuyện.
Trong đó, câu chuyện miêu tả cái chết thường gây kích thích hơn cả.
Anh thất nghiệp, lang thang tìm việc, đi phỏng vấn rồi một ngày nọ thức dậy ở nơi xa lạ.
Khung cảnh kì quái với núi đá dày đặc những khía ngang thân, không gian thảy đều nhuốm đỏ, lửa đỏ, chiều đỏ, đất đỏ, đến núi đá cũng đỏ lòm.
Từ máy trò chơi ai đó để sẵn bên cạnh, anh nhận được thông điệp, “ Chào mừng đến với mê cung sao Hỏa. Những người đến đích và an toàn thoát khỏi mê cung sẽ nhận được tiền thưởng và trở về Trái Đất. Trò chơi bắt đầu!”
Tin vui là không chỉ có mình anh gặp tình cảnh tương tự, còn tám người nữa cũng tỉnh dậy sau một giấc ngủ kì quặc và được đưa tới đây. 
Bọn họ bị cô lập giữa thiên nhiên hoang vắng này và muốn thoát ra, họ buộc phải tham gia trò chơi của kẻ giấu mặt. 
Ban đầu chẳng ai hay biết, muốn trở về được, họ phải tiêu diệt người chơi khác để bản thân trở thành kẻ duy nhất sống sót. 
Đáp án tàn khốc ấy sẽ từ từ hé lộ sau mỗi chặng hoàn thành nhiệm vụ.', 1, 41);

-- Kinh điển
-- 42. Toni Morrison
-- 43. Louisa May Alcott
-- 44. Jerome David Salinger
-- 45. ALAIN FOURNIER

insert into sach(ma_san_pham, gia, so_luong, hinh_anh, mo_ta, id_the_loai, id_tac_gia)
values('Yêu Dấu', 129000, 20, 'https://salt.tikicdn.com/cache/w400/ts/product/54/69/04/7e53bdabd8a97646b0ca7795bd482368.jpg',
'Nhìn thẳng vào vực thẳm của chế độ nô lệ, cuốn tiểu thuyết xuất sắc này đã biến lịch sử thành một câu chuyện dữ dội và rúng động. 
Seth, nữ nhân vật chính, sinh ra là nô lệ, bỏ trốn tới Ohio, nhưng mười tám năm sau chị vẫn chưa được tự do. 
Chị vẫn còn quá nhiều ký ức về Mái Ấm, về cái nơi tươi đẹp đã từng xảy ra biết bao chuyện kinh hoàng. 
Và ngôi nhà mới của chị bị ám bởi một hồn ma, hồn ma của chính đứa con chị đã giết, đứa trẻ đã chết mà chưa kịp có tên, trên mộ bia chỉ đề Yêu Dấu.', 2, 42);

insert into sach(ma_san_pham, gia, so_luong, hinh_anh, mo_ta, id_the_loai, id_tac_gia)
values('NHỮNG CÔ GÁI NHỎ', 259000, 29, 'https://down-vn.img.susercontent.com/file/60fe234583d1e259d8dd8d1a6e2ed565',
'Bốn chị em của March không thể khác biệt hơn: Meg, con cả, ngoan ngoãn và kiên nhẫn; Jo thích phiêu lưu, với ước mơ trở thành một nhà văn lớn; nhút nhát, âm nhạc Beth là người hòa bình; và Amy cứng đầu thích những điều tốt đẹp hơn trong cuộc sống.
 Họ có thể không phải lúc nào cũng hòa thuận với nhau, nhưng với việc cha bỏ đi trong Nội chiến và mẹ họ phải vật lộn kiếm sống, các chị em chưa bao giờ cần nhau hơn. 
 Cùng nhau, các cô gái điều lớn lên - từ tình yêu đầu đời đến sự ganh đua của anh chị em, mất mát và hôn nhân. 
Bất cứ điều gì xảy ra theo cách của họ, họ biết họ có thể dựa vào nhau.', 2, 43);

insert into sach(ma_san_pham, gia, so_luong, hinh_anh, mo_ta, id_the_loai, id_tac_gia)
values('Bắt trẻ đồng xanh', 99000, 20, 'https://salt.tikicdn.com/cache/w400/ts/product/19/64/ef/974ca243b72d5ffe201e3a74bbe61e8c.jpg',
'Holden Caulfield, 17 tuổi, đã từng bị đuổi học khỏi ba trường, và trường dự bị đại học Pencey Prep là ngôi trường thứ tư. Và rôi cậu lại trượt 4 trên 5 môn học và nhận được thông báo đuổi học.
 Câu chuyện kể về chuỗi ngày tiếp theo sau đó của Holden, với ánh nhìn cay độc, giễu cợt vào một cuộc đời tẻ nhạt, xấu xa, trụy lạc và vô phương hướng của một thanh niên trẻ.,', 2, 44);
 
insert into sach(ma_san_pham, gia, so_luong, hinh_anh, mo_ta, id_the_loai, id_tac_gia)
values('ANH MEAULNES', 116000, 20, 'https://bizweb.dktcdn.net/thumb/large/100/363/455/products/anhmeaulnes01.jpg?v=1695032673567',
'Kể về câu chuyện của những chàng trai trẻ tuổi trên hành trình khám phá cuộc đời, cuốn tiểu thuyết khai thác đề tài về sự chênh lệch và đối lập giữa sự vô hạn của ước mơ cùng sự hữu hạn của đời người. 
Xuyên suốt cả thiên truyện, Alain-Fournier đã khắc họa nỗi khắc khoải của con người trong cuộc đụng độ chênh lệch với định mệnh.', 2, 45);

-- Self Help


insert into sach(ma_san_pham, gia, so_luong, hinh_anh, mo_ta, id_the_loai, id_tac_gia)
values('Nghệ thuật tinh tế của việc đếch quan tâm',119000, 30,'https://salt.tikicdn.com/cache/w400/ts/product/e4/9b/b7/a8b3f9dfdd6a8eef63f20b7646c976d8.jpg',
'Trong cuộc đời mình, tôi đã từng quan tâm về quá nhiều thứ. Đồng thời tôi cũng "đếch" quan tâm tới nhiều người, nhiều điều khác nữa. Và giống như con đường chưa từng được khai phá, chính những điều tôi chẳng thèm quan tâm ấy lại tạo nên sự khác biệt. 
Chìa khóa của một cuộc sống tốt đẹp không phải là quan tâm nhiều hơn, mà là quan tâm ít đi, chỉ quan tâm tới điều gì là thật, gần gũi và thực sự quan trọng.
Cuốn này sẽ không dạy bạn cách để đạt tới điều này hay điều nọ, mà là làm thế nào để vứt bớt và buông bỏ Nó sẽ hướng dẫn bạn cách nhắm mắt lại và tin rằng bạn có thể ngã ngửa ra đằng sau mà vẫn ổn. Nó sẽ dạy bạn: ĐỪNG CỐ', 3, 46);

insert into sach(ma_san_pham, gia, so_luong, hinh_anh, mo_ta, id_the_loai, id_tac_gia)
values('Hãy Tin Vào Chính Mình! - Sức Mạnh Thay Đổi Cuộc Đời Từ Việc Tin Tưởng Bản Thân', 150000, 10, 'https://bizweb.dktcdn.net/thumb/grande/100/418/570/products/hay-tin-vao-chinh-minh-ok.jpg?v=1623210633067',
'Cuốn sách này sẽ giúp bạn vượt lên những thách thức lớn nhất và tin tưởng bản thân để trở thành người mà bạn luôn luôn biết rằng bạn có thể trở thành!', 3, 47);

insert into sach(ma_san_pham, gia, so_luong, hinh_anh, mo_ta, id_the_loai, id_tac_gia)
values('Đắc Nhân Tâm', 75000, 20, 'https://tramsach.vn/wp-content/uploads/2021/06/12-e1653631534295.png',
'Là quyển sách đầu tiên có ảnh hưởng làm thay đổi cuộc đời của hàng triệu người trên thế giới, Đắc Nhân Tâm là cuốn sách đem lại những giá trị tuyệt vời cho người đọc, bao gồm những lời khuyên cực kì bổ ích về cách ứng xử trong cuộc sống hàng ngày. Sức lan toả của quyển sách vô cùng rộng lớn – với nhiều tầng lớp, đối tượng.', 3, 48);


-- --5--
INSERT INTO sach( ma_san_pham, gia, so_luong, hinh_anh, mo_ta, id_the_loai, id_tac_gia) VALUES ( 'Không gia đình', '280000', '34', "https://upload.wikimedia.org/wikipedia/vi/f/fa/Kh%C3%B4ng_gia_%C4%91%C3%ACnh_1_%28s%C3%A1ch%29.jpg", ' Không gia đình (tiếng Pháp: Sans famille), còn được dịch là Vô gia đình, có thể được xem là tiểu thuyết nổi tiếng nhất của nhà văn Pháp Hector Malot, được xuất bản năm 1878. Tác phẩm đã nhận được giải thưởng của Viện Hàn lâm Văn học Pháp. Nhiều nước trên thế giới đã dịch lại tác phẩm và xuất bản nhiều lần. Từ một trăm năm nay, Không gia đình đã trở nên quen thuộc đối với thiếu nhi Pháp và thế giới. Kiệt tác này đã được xuất hiện nhiều lần trên phim ảnh và truyền hình.', '1', '27');
INSERT INTO sach( ma_san_pham, gia, so_luong, hinh_anh, mo_ta, id_the_loai, id_tac_gia) VALUES ( 'Mảnh ghép bí ẩn', '120000', '68', 'https://m.media-amazon.com/images/I/71IgDMCVvmL._AC_UF1000,1000_QL80_.jpg', 'Giữa việc hoàn thành tấm bằng sinh học, chăm sóc cháu trai và bắt đầu công việc mới tại cửa hàng đồ cổ trong khi chảy nước miếng trước cậu con trai xinh đẹp của người chủ, Aly không có thời gian để tưởng tượng. Nhưng khi khách hàng cáu kỉnh Earl bị giết và ông chủ mới của Aly, Olive là nghi phạm chính, cô phải sử dụng sức mạnh mới tìm được của mình để cứu người duy nhất hiểu được những món quà của Aly. Ai ghét Earl đến mức giết chết? Cảnh sát thà bắt giữ nhanh chóng hơn là điều tra, vì vậy việc xóa tên của Olive là tùy thuộc vào Aly.', '1', '28');
INSERT INTO sach( ma_san_pham, gia, so_luong, hinh_anh, mo_ta, id_the_loai, id_tac_gia) VALUES ( 'Cuộc phiêu lưu của Alice ở xứ sở thần tiên', '350000', '120', 'https://cdn-amz.woka.io/images/I/91MFVwBsxjL.jpg', 'Alice của Lewis Carroll đã mê hoặc trẻ em suốt 150 năm. Alice tò mò, Thỏ trắng hống hách, Nữ hoàng trái tim đáng gờm và Mad Hatter là một trong những tác phẩm văn học mang tính biểu tượng, được yêu thích nhất mọi thời đại. Macmillan là nhà xuất bản ban đầu của Alice vào năm 1865 và tự hào luôn giữ đúng tầm nhìn của những người sáng tạo ra nó. Những hình ảnh minh họa đáng chú ý của Sir John Tenniel đều mang tính biểu tượng, thể hiện hoàn hảo sự kết hợp giữa điều bình thường và điều phi thường ở trung tâm của Wonderland.', '2', '29');
INSERT INTO sach( ma_san_pham, gia, so_luong, hinh_anh, mo_ta, id_the_loai, id_tac_gia) VALUES ( 'Bắt cóc', '150000', '160', 'https://robert-louis-stevenson.org/wp-content/uploads/kidnapped2-225x300.jpg', 'Đầy tinh thần, lãng mạn và đầy nguy hiểm, Kidnapped là tác phẩm kinh điển về phiêu lưu mạo hiểm của Robert Louis Stevenson. Được nhiều thế hệ yêu mến, đó là câu chuyện về David Balfour, một người thừa kế trẻ tuổi có người chú tham lam đồng mưu giết anh ta bằng tài sản thừa kế và âm mưu bắt anh ta và bán làm nô lệ. Nhưng danh dự, lòng trung thành và lòng dũng cảm sẽ được khen thưởng; đứa trẻ mồ côi và bị bỏ rơi sống sót sau vụ bắt cóc và đắm tàu, được giải cứu bởi một kẻ lừa đảo liều lĩnh và thực hiện một cuộc trốn thoát ly kỳ để tìm tự do trên khắp vùng cao nguyên hoang dã của Scotland.', '2', '30');
INSERT INTO sach( ma_san_pham, gia, so_luong, hinh_anh, mo_ta, id_the_loai, id_tac_gia) VALUES ('Anne of Green Gables', '200000', '98', 'https://cdn0.fahasa.com/media/catalog/product/a/n/anne_of_green_gables_vintage_classics_1_2020_04_29_13_33_41.jpg', 'Điều tôi không thích: Là một đứa trẻ mồ côi, có mái tóc đỏ, mọi người bàn tán về mái tóc đỏ của tôi, bị Gilbert Blythe gọi là \"củ cà rốt\". Sở thích của tôi: Sống ở Chái Nhà Xanh với Marilla và Matthew Cuthbert, Diana, bạn thân của tôi, mặc váy tay phồng, đổi tên ao của Barry thành Hồ Nước Lấp Lánh, đứng đầu lớp. Điều hối tiếc của tôi: Nhuộm tóc màu xanh lá cây. Đập một phiến đá lên đầu Gilbert Blythe. Ước mơ của tôi: Chế ngự tính nóng nảy của mình. Để trở nên tốt (đây là một cuộc đấu tranh khó khăn). Lớn lên có mái tóc màu nâu vàng!', '2', '31');
INSERT INTO sach( ma_san_pham, gia, so_luong, hinh_anh, mo_ta, id_the_loai, id_tac_gia) VALUES ( '451 độ F', '200000', '36', 'https://m.media-amazon.com/images/I/71X0Wsoa+vL._AC_UF1000,1000_QL80_.jpg', 'Guy Montag là lính cứu hỏa. Công việc của anh ta là tiêu hủy những mặt hàng bất hợp pháp nhất, sách in, cùng với những ngôi nhà nơi chúng được cất giấu. Montag không bao giờ đặt câu hỏi về sự tàn phá và hủy hoại mà hành động của anh tạo ra, mỗi ngày trở lại với cuộc sống nhạt nhẽo của anh và người vợ, Mildred, người dành cả ngày cho “gia đình” truyền hình của cô. Nhưng khi anh gặp một người hàng xóm trẻ tuổi lập dị, Clarisse, người đã giới thiệu cho anh về quá khứ nơi con người không sống trong sợ hãi và về hiện tại nơi người ta nhìn thế giới qua những ý tưởng trong sách thay vì những cuộc trò chuyện vô nghĩa trên tivi, Montag bắt đầu hỏi tất cả những gì anh từng biết.', '2', '32');
INSERT INTO sach( ma_san_pham, gia, so_luong, hinh_anh, mo_ta, id_the_loai, id_tac_gia) VALUES ('Nhà giả kim', '250000', '99', 'https://m.media-amazon.com/images/W/MEDIAX_792452-T2/images/I/51bVNTqHFlL._AC_UF1000,1000_QL80_.jpg', 'Kết hợp phép thuật, sự huyền bí, trí tuệ và điều kỳ diệu thành một câu chuyện đầy cảm hứng về sự khám phá bản thân, Nhà giả kim đã trở thành một tác phẩm kinh điển hiện đại, bán được hàng triệu bản trên khắp thế giới và thay đổi cuộc sống của vô số độc giả qua nhiều thế hệ.', '3', '33');
INSERT INTO sach( ma_san_pham, gia, so_luong, hinh_anh, mo_ta, id_the_loai, id_tac_gia) VALUES ( 'Thay đổi tí hon hiệu quả bất ngờ', '130000', '25', 'https://m.media-amazon.com/images/W/MEDIAX_792452-T2/images/I/81YkqyaFVEL._AC_UF1000,1000_QL80_.jpg', 'Bất kể mục tiêu của bạn là gì, Atomic Habits đều cung cấp một khuôn khổ đã được chứng minh để cải thiện--hàng ngày. James Clear, một trong những chuyên gia hàng đầu thế giới về hình thành thói quen, tiết lộ những chiến lược thực tế sẽ dạy bạn chính xác cách hình thành thói quen tốt, từ bỏ thói quen xấu và làm chủ những hành vi nhỏ dẫn đến kết quả đáng chú ý.', '3', '34');
INSERT INTO sach( ma_san_pham, gia, so_luong, hinh_anh, mo_ta, id_the_loai, id_tac_gia) VALUES ( 'Suy nghĩ nhanh và chậm', '120000', '32', 'https://salt.tikicdn.com/cache/w1200/ts/product/05/a9/0e/fa26cefb7aa153467118665da97e90ab.png', 'Hệ thống 1 nhanh, trực quan và giàu cảm xúc; Hệ thống 2 chậm hơn, cân nhắc hơn và logic hơn. Tác động của sự tự tin thái quá lên các chiến lược của công ty, những khó khăn trong việc dự đoán điều gì sẽ khiến chúng ta hạnh phúc trong tương lai, tác động sâu sắc của những thành kiến nhận thức lên mọi thứ, từ chơi thị trường chứng khoán đến lên kế hoạch cho kỳ nghỉ tiếp theo của chúng ta – mỗi điều này chỉ có thể được hiểu bằng cách biết cách thực hiện. hai hệ thống định hình các phán đoán và quyết định của chúng ta.', '3', '35');
INSERT INTO sach( ma_san_pham, gia, so_luong, hinh_anh, mo_ta, id_the_loai, id_tac_gia) VALUES ( 'Bốn thỏa thuận', '320000', '78', 'https://m.media-amazon.com/images/W/MEDIAX_792452-T2/images/I/81hHy5XrdKL._AC_UF1000,1000_QL80_.jpg', '“Cuốn sách này của Don Miguel Ruiz, đơn giản nhưng rất mạnh mẽ, đã tạo ra sự khác biệt to lớn trong cách tôi suy nghĩ và hành động trong mọi cuộc gặp gỡ.” —Oprah Winfrey', '3', '36');


