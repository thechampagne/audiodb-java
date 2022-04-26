# TheAudioDB

[![](https://img.shields.io/github/v/tag/thechampagne/audiodb-java?label=version)](https://github.com/thechampagne/audiodb-java/releases/latest) [![](https://img.shields.io/github/license/thechampagne/audiodb-java)](https://github.com/thechampagne/audiodb-java/blob/main/LICENSE)

TheAudioDB API client for **Java**.

### Download

Replace the **VERSION** key below with the version shown above.

**Gradle**
```gradle
dependencies {
    implementation 'io.github.thexxiv:audiodb:VERSION'
}
```

**Maven**
```xml
<dependency>
    <groupId>io.github.thexxiv</groupId>
    <artifactId>audiodb</artifactId>
    <version>VERSION</version>
</dependency>
```

### Example

```java
public static void main(String[] args) {
    for (Album i : AudioDB.searchAlbumsByArtistId(111674)) {
        System.out.println(i.strAlbum);
    }
}
```

### License

TheAudioDB is released under the [Apache License 2.0](https://github.com/thechampagne/audiodb-java/blob/main/LICENSE).

```
 Copyright 2022 XXIV

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
```