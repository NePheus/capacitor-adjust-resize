[![capacitor support](https://img.shields.io/badge/capacitor%20support-v3-brightgreen?logo=capacitor)](https://capacitorjs.com/)

# capacitor-adjust-resize

This plugin attaches an observer for layout changes on the native layer.

Example: When the keyboard opens, this plugin automatically adds bottom padding to the android layout, so the webview ends on top of the soft keyboard.

Why: On using <item name="android:windowTranslucentNavigation">true</item>, the keyboard overlays the webview and does not shrink the webview automatically.

Just call the 'register' method on app start to activate the plugin.

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

## API

<docgen-index>

* [`register()`](#register)

</docgen-index>

<docgen-api>
<!--Update the source file JSDoc comments and rerun docgen to update the docs below-->

### register()

```typescript
register() => any
```

**Returns:** <code>any</code>

--------------------

</docgen-api>
