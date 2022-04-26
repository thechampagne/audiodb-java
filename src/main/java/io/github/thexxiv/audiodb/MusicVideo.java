/*
 * Copyright 2022 XXIV
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.github.thexxiv.audiodb;

import java.util.ArrayList;

public class MusicVideo{
    public String idArtist;
    public String idAlbum;
    public String idTrack;
    public String strTrack;
    public String strTrackThumb;
    public String strMusicVid;
    public String strDescriptionEN;

    @Override
    public String toString() {
        return "MusicVideo{" +
                "idArtist='" + idArtist + '\'' +
                ", idAlbum='" + idAlbum + '\'' +
                ", idTrack='" + idTrack + '\'' +
                ", strTrack='" + strTrack + '\'' +
                ", strTrackThumb='" + strTrackThumb + '\'' +
                ", strMusicVid='" + strMusicVid + '\'' +
                ", strDescriptionEN='" + strDescriptionEN + '\'' +
                '}';
    }
}

class BaseMusicVideo{
    ArrayList<MusicVideo> mvids;
}

