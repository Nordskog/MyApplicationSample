import android.os.Handler;
import android.os.Looper;
import android.telecom.Call;

import java.io.IOException;

import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class Public_Methods
{
	// Generic send get http method
	public static void Gethttp(String URL, final GetHttpStringResponse callback)
	{

		OkHttpClient client = new OkHttpClient();

		Request request = new Request.Builder()
				.url(URL)
				.build();

		// Asynchronous Get
		client.newCall(request).enqueue(new Callback()
		{

			@Override
			public void onFailure(okhttp3.Call call, IOException e)
			{
				call.cancel();

			}

			// onResponse runs in a a background thread by default
			@Override
			public void onResponse(final okhttp3.Call call, Response response) throws IOException
			{

				final String reply = response.body().string().trim();

				if (callback != null)
				{
					// okhttp calls onResponse on a background thread. Let's call it on the main thread instead.
					// This is the same as runOnUiThread
					Handler handler = new Handler(Looper.getMainLooper());
					handler.post( () -> callback.onResponse(reply)); // Lambda!
				}
			}
		});

		return;

	}

	// Interface for callback
	public interface GetHttpStringResponse
	{
		void onResponse(String res);
	}

	/////////////////
	// How to use
	/////////////////

	public static void howToUseTheThing()
	{
		Public_Methods.Gethttp("https://www.google.com/", new GetHttpStringResponse()
		{
			@Override
			public void onResponse(String res)
			{
				// Do something with response here. Display it in a view or something.
			}
		});
	}


}
