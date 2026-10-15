# NDIand Monitor
Android receiver project for OBS NDI and OMT monitoring.

## Current status
Version 0.1 is an **installation/build smoke test only**. It does not yet discover or decode NDI or OMT streams. Do not use it as a production video monitor.

## Build
GitHub Actions > Build Android APK > Run workflow. Download the NDIand-debug-apk artifact when the workflow succeeds.

## Roadmap
1. Validate installation on Galaxy S26 Ultra.
2. Integrate and test Android-compatible OMT receiver and decode path.
3. Integrate licensed NDI Android SDK and source discovery.
4. Add fullscreen video, audio, reconnect, and latency diagnostics.
