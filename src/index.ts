import { registerPlugin } from '@capacitor/core';
import type { AdjustResizePlugin } from './definitions';

const AdjustResize = registerPlugin<AdjustResizePlugin>('AdjustResize', {
  web: () => import('./web').then(m => new m.AdjustResizeWeb()),
});

export * from './definitions';
export { AdjustResize };
