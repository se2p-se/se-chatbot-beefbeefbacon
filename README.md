# ChatBot
Beispielsystem für Lehr- und Übungszwecke

## Ausführen

### Via IDE
Main.main() starten.

### Via Buildsystem
Das Projekt nutzt das Buildsystem [Gradle](https://gradle.org)

Die Verwendung des Buildsystems erfolgt über den mitgelieferten Gradle-Wrapper
`gradlew` bzw. `gradlew.bat` (für Windows).

Gradle ermöglicht die Erzeugung von ausführbaren Skripten:

`./gradlew installDist` erzeugt im Unterverzeichnis `build/install/ChatBot/bin/`
die Skripte `ChatBot` bzw. `ChatBot.bat` (Windows).
Diese können dann in einer Shell gestartet werden.

Eine weitere Möglichkeit ist das direkte Ausführen via Gradle,
per `./gradlew run -q`,
welches bei interaktiven Shells (wie in unserem Beispielprojekt)
nicht so gut funktioniert.

Weitere Dokumentation zu Gradle ist
[online](https://doc.gradle.org/3.3/userguide/userguide.html)
verfügbar.
