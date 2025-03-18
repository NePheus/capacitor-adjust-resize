[![npm version](https://badge.fury.io/js/capacitor-adjust-resize.svg)](https://badge.fury.io/js/capacitor-adjust-resize)
[![capacitor support](https://img.shields.io/badge/capacitor%20support-v7-brightgreen?logo=capacitor)](https://capacitorjs.com/)

# capacitor-adjust-resize

This plugin attaches an observer for layout changes on the native layer.

Example: When the keyboard opens, this plugin automatically adds bottom padding to the android layout, so the webview ends on top of the soft keyboard.

Why: On using <item name=\"android:windowTranslucentNavigation\">true<\/item>, the keyboard overlays the webview and does not shrink the webview automatically.

## Supported platforms

| Platform | Supported |
| -------- | --------: |
| Android  |         ✔ |
| iOS      |         ✖ |
| Web      |         ✖ |

## Install

```bash
npm i capacitor-adjust-resize
npx cap sync android
```

The plugin is activated on load automatically.

## API

<docgen-index>



</docgen-index>

<docgen-api>
<!--Update the source file JSDoc comments and rerun docgen to update the docs below-->



</docgen-api>
