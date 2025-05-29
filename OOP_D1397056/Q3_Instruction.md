請設計一個簡單的寶可夢遊戲，利用物件導向程式設計的原則來模擬寶可夢的生成、升級與對戰過程。需要使用繼承、封裝、靜態方法等技術，並且將每個類別的設計與遊戲邏輯實現完整的互動。
功能需求：

1. PokemonUtil 類別：
   ⚫ 請創建一個名為 PokemonUtil 的公開靜態類別，並在其中定義以下常數和方法：
   ✓ 靜態常數：
   I. MAX_LEVEL：表示最大等級，其值為 20。
   II. MAX_CANDY：表示最大糖果數量，其值為 100。
   ✓ 靜態方法：
   I. generateType()：回傳一個隨機的寶可夢屬性（String），屬性可以是「Fire」、「Water」、「Grass」等。使用隨機數生成器來選擇屬性。
   II. generateLevel()： 回 傳 一 個 隨 機 等 級 （ int）， 範 圍 從 1 到 MAX_LEVEL 之間的整數。
   III. generateCandy() ：回傳一個隨機的糖果數量（int），範圍從 0 到 MAX_CANDY 之間的整數。
2. Pokemon 類別：
   ⚫ 創建一個名為 Pokemon 的公開類別，並包含以下屬性與方法：
   ✓ 私有靜態變數：
   I. pokemonCount：用於儲存當前創建的 Pokemon 數量。
   ✓ 私有屬性：
   I. name：寶可夢的名稱（String 類型）
   II. type：寶可夢的屬性（String 類型）
   III. level：寶可夢的等級（int 類型）
   IV. candy：寶可夢的糖果數量（int 類型）
   ✓ 建構方法：
   I. 接受一個參數 name ，並在建構方法中使用 PokemonUtil 的靜態方法來初始化 type、level 和 candy，同時更新靜態變數
   pokemonCount。
   ✓ 公開方法：
   I. getName()、getType()、getLevel()、getCandy()：回傳寶可夢的名稱、屬性、等級和糖果數量。
   II. displayInfo()：顯示寶可夢的詳細資訊，包括名稱、屬性、等級和糖果數量。
   III. getPokemonCount()：回傳創建的 Pokemon 數量。
   IV. evolve() ：當寶可夢進化時，如果糖果數量大於或等於 10 顆，則將等級增加 1，並減少 10 顆糖果；如果糖果不足，則顯示提示訊息。
3. Psyduck、Charizard、Bulbasaur 子類別：
   ⚫ 創建三個子類別 Psyduck、Charizard 和 Bulbasaur，繼承自 Pokemon 類別，並在其建構方法中設定對應的屬性：
   ✓ Psyduck → Water
   ✓ Charizard → Fire
   ✓ Bulbasaur → Grass
   ⚫ 覆寫 displayInfo() 方法，顯示每個寶可夢的詳細資訊，並在顯示資訊後額外印出該子類別的名稱。
4. Gym 類別：
   ⚫ 創建一個名為 Gym 的類別，並包含以下屬性和方法：
   ✓ 屬性：
   I. name：道館的名稱（String 型態）
   ✓ 方法：
   I. getName()：返回道館的名稱。
   II. fight(Pokemon pokemon1, Pokemon pokemon2)：接受兩個Pokemon 物件作為參數，根據以下規則決定勝者：
   ◼ 如果 pokemon1 的等級高於 pokemon2，則 pokemon1 獲勝。
   ◼ 如果 pokemon2 的等級高於 pokemon1，則 pokemon2 獲勝。
   ◼ 如果等級相同，則根據屬性決定勝者：
   ◆ Fire 贏 Grass
   ◆ Grass 贏 Water
   ◆ Water 贏 Fire
   ◼ 如果屬性相同，則隨機選一位勝者。
   ◼ 回傳勝者的副本。
5. Main 類別：
   ⚫ 創建一個名為 Main 的類別，並在 main 方法中進行寶可夢對戰。
   ⚫ 具體要求：
   ✓ 使用 Scanner 讀取使用者輸入的寶可夢類別名稱（如 Psyduck、Charizard、Bulbasaur）。
   ✓ 使用 Scanner 來讀取使用者輸入的寶可夢名稱（如北京烤鴨）。
   ✓ 當使用者輸入的類別名稱不是 `exit` 時，根據寶可夢類別名稱創建一隻新的 `Pokemon` 的子類別物件，並將其與前一隻獲勝的寶可夢進行對戰。
   ✓ 在每次對戰後，根據獲勝的寶可夢更新上一隻獲勝的寶可夢。
   ✓ 當使用者輸入 `exit` 時，退出遊戲，並印出最後勝利的寶可夢名稱、屬性、等級、類別名稱與總共創建的寶可夢數量。
6. 輸入與輸出範例：
   輸入：
   請輸入寶可夢類別名稱（Psyduck, Charizard, Bulbasaur ，或輸入 'exit' 以退出）： Psyduck
   請輸入寶可夢名稱：北京烤鴨
   請輸入寶可夢類別名稱（Psyduck, Charizard, Bulbasaur，或輸入 'exit' 以退出）：
   Charizard
   請輸入寶可夢名稱：小火龍
   請輸入寶可夢類別名稱（Psyduck, Charizard, Bulbasaur，或輸入 'exit' 以退出）：
   Bulbasaur
   請輸入寶可夢名稱： 小青蛙
   請輸入寶可夢類別名稱（Psyduck, Charizard, Bulbasaur，或輸入 'exit' 以退出）：exit
   輸出：
   名稱: 小火龍
   屬性: Fire
   等級: 17
   類別名稱: Charizard
   總共創建的寶可夢數量: 3