# TSM_server_changer
這是一個 Minecraft Fabric Client Mod，用來自動切換伺服器到2服(可以自己改程式碼到1服)。
#功能
- 玩家連線到mc.stud3nt.xyz時，自動發送切換伺服器的指令。
- 為了解決在掛機時伺服器重啟或是斷線重連後跑到一服的狀況。

#建置與安裝
1. 確認已安裝 Java 21 和 Gradle。
2. 使用 Fabric Loom(v1.4.1) 進行專案建置。
3. 執行(在cmd)：
   gradlew.bat build(Windows)
   ./gradlew build(Linuxs)
生成的 .jar 檔案會在 build/libs 資料夾。

用法
將編譯好的 mod 放入 Minecraft mods 資料夾即可。

注意事項
請確認使用的 Fabric API(0.119.3)， 和 Minecraft(1.21.4) 版本相容。(版本都可以在build.gradle裡面更改)
