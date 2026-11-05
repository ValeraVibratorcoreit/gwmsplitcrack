# Деобфусцированные ключевые классы

Это **реконструкция**, а не оригинальные исходники. Имена классов/полей/методов восстановлены по роли в приложении; строки и часть заглушек упрощены, чтобы читалась логика.

| Файл | Оригинал | Что показывает |
|---|---|---|
| `LicenseState.java` | `cfgData` + `AbstractC1372y1` | режимы demo/free/full, маппинг `paylevelid`, ограничения, локальное истечение demo |
| `LicenseController.java` | `p098q0.C1344p0` + `C1341o0` | DeviceMeta, фоновые задачи, LiveData |
| `LicenseApiClient.java` | `network.C0654a` | три сетевых запроса: update, telemetry/license, activate |
| `BackgroundMonitorService.java` | `InternetMonitoringService` + `RunnableC0024r` case 19 | периодическая проверка, 3 часа, 2 суток |
| `ActivationActivity.java` | `Pay` + `RunnableC1362v0` | активация кодом и переход в FULL |
| `CarState.java` | `carData` | скорость/обороты как LiveData |
| `UserThemeParser.java` | `p109u0.C1563o1` + `C1554l1` + `C1560n1` | JSON-схема user-theme, `gauges.speedometer/tachometer`, параметры |
| `UserThemeRenderer.java` | `p109u0.C1518Z0` | построение колодцев, подписки, цикл 16 мс |
| `GaugeAnimator.java` | `p098q0.C1260G0` | value -> angle + экспоненциальное сглаживание |
| `Theme47Renderer.java` | `p109u0.C1568q0` + `C1572s` | встроенная кастомная тема 47 (и аналоги 48..51) |
| `NativeBridge.java` | `NativeLib` | JNI-контракт с `libnative-lib.so` |

Подробный разбор — в `../REPORT.md`.
