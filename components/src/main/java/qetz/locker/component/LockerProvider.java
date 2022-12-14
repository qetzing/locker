package qetz.locker.component;

import com.google.inject.Inject;
import com.google.inject.Provider;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import org.bukkit.Bukkit;
import qetz.locker.Locker;

@RequiredArgsConstructor(access = AccessLevel.PRIVATE, onConstructor_ = @Inject)
public final class LockerProvider implements Provider<Locker> {
  public static LockerProvider create() {
    return new LockerProvider();
  }

  @Override
  public Locker get() {
    return Bukkit.getServicesManager().load(Locker.class);
  }
}