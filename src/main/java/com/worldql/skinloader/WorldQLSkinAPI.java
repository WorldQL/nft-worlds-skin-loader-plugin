package com.worldql.skinloader;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;
import java.util.UUID;

public class WorldQLSkinAPI {
    private static final Gson GSON = new Gson();

    public static class Response {
        @SerializedName("skin_url")
        public String skinUrl;
        @SerializedName("skin_type")
        public String skinType;

        @SerializedName("cape_url")
        @Nullable
        public String capeUrl;

        @SerializedName("elytra_url")
        @Nullable
        public String elytraUrl;
    }

    public static Response getSkinsForUser(HttpClient client, String apiRoot, UUID playerId) throws IOException {
        HttpGet request = new HttpGet(apiRoot + "/skins/" + playerId);
        HttpResponse response = client.execute(request);
        if (response.getStatusLine().getStatusCode() != 200)
            return null;

        String body = new BasicResponseHandler().handleResponse(response);
        return GSON.fromJson(body, Response.class);
    }
}
