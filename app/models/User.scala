package models

import play.api.libs.json.Json

case class User(name: String, age: Int)

object User {

  // ジェネレーターで作成。
  // cf. すごい名前生成器: https://namegen.jp
  val findAll: Seq[User] = Seq(
    User("川中 豊", 25),
    User("坂元 佑", 42),
    User("長野 信輔", 45),
    User("大江 翔子", 37),
    User("水上 隼士", 27),
    User("宮島 丈史", 78),
    User("小関 恵子", 50),
    User("中山 恵望子", 26),
    User("田沢 精児", 47),
    User("黒沢 雅彦", 74),
    User("川島 明", 30),
    User("中山 あさみ", 28),
    User("土井 詩織", 64),
    User("清田 由美子", 37),
    User("前川 まさみ", 50),
    User("石塚 鉄洋", 59),
    User("大和田 愛子", 61),
    User("南部 染五郎", 38),
    User("沢尻 亜希", 26),
    User("門田 めぐみ", 37),
    User("赤松 瞬", 65),
    User("山川 涼子", 37),
    User("上野 小雁", 46),
    User("金山 祐一", 66),
    User("沢田 寿明", 64),
    User("山口 蒼甫", 40),
    User("岩井 花緑", 47),
    User("村上 一輝", 80),
    User("大友 賢治", 80),
    User("奥貫 沙耶", 29),
    User("本田 瞬", 79),
    User("秋葉 正敏", 76),
    User("秋元 徹平", 48),
    User("宮地 建", 63),
    User("古田 璃子", 57),
    User("城戸 菜摘", 76),
    User("一木 一徳", 21),
    User("大野 詩織", 26),
    User("土屋 美智子", 47),
    User("内野 薫", 76),
    User("菅沼 拓郎", 62),
    User("半田 春樹", 79),
    User("堀井 美紀", 20),
    User("綾瀬 あき", 67),
    User("高嶋 智花", 46),
    User("松原 秀樹", 55),
    User("滝田 京子", 62),
    User("小池 景子", 40),
    User("飯田 慢太郎", 63),
    User("近藤 しほり", 44)
  )

  implicit val format = Json.format[User]

}
