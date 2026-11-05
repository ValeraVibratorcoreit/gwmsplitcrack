# Meteocons (Lottie) — weather icons

Source: [basmilius/meteocons](https://github.com/basmilius/meteocons) / npm `@meteocons/lottie`  
Style: `fill` · License: **MIT** (see `LICENSE`)

Bundled offline for HU. Playback: Airbnb Lottie (`com.airbnb.android:lottie`) in Split Info weather page.

## OpenWeather `weather id` → asset

Path: `assets/meteocons/fill/<name>.json`

| OW code | Condition | File |
|--------|-----------|------|
| 200–299 | thunderstorm | `thunderstorms-rain.json` (fallback `thunderstorms.json`) |
| 300–399 | drizzle | `drizzle.json` |
| 500–504 | rain | `rain.json` |
| 511 | freezing rain | `sleet.json` |
| 520–531 | shower | `overcast-rain.json` |
| 600–622 | snow | `snow.json` |
| 701–762 | fog/mist/haze | `fog.json` / `mist.json` |
| 771–781 | squall/tornado | `extreme-rain.json` |
| 800 | clear | `clear-day.json` (night: `clear-night.json`) |
| 801 | few clouds | `partly-cloudy-day.json` |
| 802 | scattered | `partly-cloudy-day.json` |
| 803 | broken | `cloudy.json` |
| 804 | overcast | `overcast.json` |

Optional: `partly-cloudy-night.json`, `hail.json`, `partly-cloudy-day-rain.json`.
