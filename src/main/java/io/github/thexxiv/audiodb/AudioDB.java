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

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/**
 * TheAudioDB API client.
 * <p>
 * TheAudioDB is a community Database of
 * audio artwork and metadata
 *
 * @author XXIV
 */
public class AudioDB {

    private static String http(String endpoint) {
        try {
            URL url = new URL(String.format("https://theaudiodb.com/api/v1/json/2/%s", endpoint));
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            BufferedReader reader;
            if (100 <= connection.getResponseCode() && connection.getResponseCode() <= 399) {
                reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            } else {
                reader = new BufferedReader(new InputStreamReader(connection.getErrorStream()));
            }
            StringBuilder string = new StringBuilder();
            String output;
            while ((output = reader.readLine()) != null) {
                string.append(output);
            }
            return string.toString();
        } catch (Exception ex) {
            return null;
        }
    }

    /**
     *
     * @param s
     * @return Return Artist details from artist name
     */
    public static Artist searchArtist(String s) {
        try {
            String response = http(String.format("search.php?s=%s", URLEncoder.encode(s, StandardCharsets.UTF_8.toString())));
            if (response != null && response.length() != 0) {
                Gson gson = new Gson();
                BaseArtist data = gson.fromJson(response, BaseArtist.class);
                if (data.artists != null && !data.artists.isEmpty()) {
                    return data.artists.get(0);
                } else {
                    return null;
                }
            } else {
                return null;
            }
        } catch (Exception ex) {
            return null;
        }
    }

    /**
     *
     * @param s
     * @return Return Discography for an Artist with Album names and year only
     */
    public static List<Discography> discography(String s) {
        try {
            String response = http(String.format("discography.php?s=%s", URLEncoder.encode(s, StandardCharsets.UTF_8.toString())));
            if (response != null && response.length() != 0) {
                Gson gson = new Gson();
                BaseDiscography data = gson.fromJson(response, BaseDiscography.class);
                if (data.album != null && !data.album.isEmpty()) {
                    List<Discography> list = new ArrayList<>(data.album);
                    if (list.isEmpty()) {
                        return null;
                    } else {
                        return list;
                    }
                } else {
                    return null;
                }
            } else {
                return null;
            }
        } catch (Exception ex) {
            return null;
        }
    }

    /**
     *
     * @param l
     * @return Return individual Artist details using known Artist ID
     */
    public static Artist searchArtistById(long l) {
        try {
            String response = http(String.format("artist.php?i=%d", l));
            if (response != null && response.length() != 0) {
                Gson gson = new Gson();
                BaseArtist data = gson.fromJson(response, BaseArtist.class);
                if (data.artists != null && !data.artists.isEmpty()) {
                    return data.artists.get(0);
                } else {
                    return null;
                }
            } else {
                return null;
            }
        } catch (Exception ex) {
            return null;
        }
    }

    /**
     *
     * @param l
     * @return Return individual Album info using known Album ID
     */
    public static Album searchAlbumById(long l) {
        try {
            String response = http(String.format("album.php?m=%d", l));
            if (response != null && response.length() != 0) {
                Gson gson = new Gson();
                BaseAlbum data = gson.fromJson(response, BaseAlbum.class);
                if (data.album != null && !data.album.isEmpty()) {
                    return data.album.get(0);
                } else {
                    return null;
                }
            } else {
                return null;
            }
        } catch (Exception ex) {
            return null;
        }
    }

    /**
     *
     * @param l
     * @return Return All Albums for an Artist using known Artist ID
     */
    public static List<Album> searchAlbumsByArtistId(long l) {
        try {
            String response = http(String.format("album.php?i=%d", l));
            if (response != null && response.length() != 0) {
                Gson gson = new Gson();
                BaseAlbum data = gson.fromJson(response, BaseAlbum.class);
                if (data.album != null && !data.album.isEmpty()) {
                    List<Album> list = new ArrayList<>(data.album);
                    if (list.isEmpty()) {
                        return null;
                    } else {
                        return list;
                    }
                } else {
                    return null;
                }
            } else {
                return null;
            }
        } catch (Exception ex) {
            return null;
        }
    }

    /**
     *
     * @param l
     * @return Return All Tracks for Album from known Album ID
     */
    public static List<Track> searchTracksByAlbumId(long l) {
        try {
            String response = http(String.format("track.php?m=%d", l));
            if (response != null && response.length() != 0) {
                Gson gson = new Gson();
                BaseTrack data = gson.fromJson(response, BaseTrack.class);
                if (data.track != null && !data.track.isEmpty()) {
                    List<Track> list = new ArrayList<>(data.track);
                    if (list.isEmpty()) {
                        return null;
                    } else {
                        return list;
                    }
                } else {
                    return null;
                }
            } else {
                return null;
            }
        } catch (Exception ex) {
            return null;
        }
    }

    /**
     *
     * @param l
     * @return Return individual track info using a known Track ID
     */
    public static Track searchTrackById(long l) {
        try {
            String response = http(String.format("track.php?h=%d", l));
            if (response != null && response.length() != 0) {
                Gson gson = new Gson();
                BaseTrack data = gson.fromJson(response, BaseTrack.class);
                if (data.track != null && !data.track.isEmpty()) {
                    return data.track.get(0);
                } else {
                    return null;
                }
            } else {
                return null;
            }
        } catch (Exception ex) {
            return null;
        }
    }

    /**
     *
     * @param l
     * @return Return all the Music videos for a known Artist ID
     */
    public static List<MusicVideo> searchMusicVideosByArtistId(long l) {
        try {
            String response = http(String.format("mvid.php?i=%d", l));
            if (response != null && response.length() != 0) {
                Gson gson = new Gson();
                BaseMusicVideo data = gson.fromJson(response, BaseMusicVideo.class);
                if (data.mvids != null && !data.mvids.isEmpty()) {
                    List<MusicVideo> list = new ArrayList<>(data.mvids);
                    if (list.isEmpty()) {
                        return null;
                    } else {
                        return list;
                    }
                } else {
                    return null;
                }
            } else {
                return null;
            }
        } catch (Exception ex) {
            return null;
        }
    }
}