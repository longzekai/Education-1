// Generated by Dagger (https://google.github.io/dagger).
package com.weike.education.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

public final class ApiModule_ProvideAppRetrofitFactory implements Factory<Retrofit> {
  private final ApiModule module;

  private final Provider<Retrofit.Builder> builderProvider;

  private final Provider<OkHttpClient> clientProvider;

  public ApiModule_ProvideAppRetrofitFactory(
      ApiModule module,
      Provider<Retrofit.Builder> builderProvider,
      Provider<OkHttpClient> clientProvider) {
    this.module = module;
    this.builderProvider = builderProvider;
    this.clientProvider = clientProvider;
  }

  @Override
  public Retrofit get() {
    return provideInstance(module, builderProvider, clientProvider);
  }

  public static Retrofit provideInstance(
      ApiModule module,
      Provider<Retrofit.Builder> builderProvider,
      Provider<OkHttpClient> clientProvider) {
    return proxyProvideAppRetrofit(module, builderProvider.get(), clientProvider.get());
  }

  public static ApiModule_ProvideAppRetrofitFactory create(
      ApiModule module,
      Provider<Retrofit.Builder> builderProvider,
      Provider<OkHttpClient> clientProvider) {
    return new ApiModule_ProvideAppRetrofitFactory(module, builderProvider, clientProvider);
  }

  public static Retrofit proxyProvideAppRetrofit(
      ApiModule instance, Retrofit.Builder builder, OkHttpClient client) {
    return Preconditions.checkNotNull(
        instance.provideAppRetrofit(builder, client),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
