import { WebPlugin } from '@capacitor/core';
import { AdjustResizePlugin } from './definitions';

export class AdjustResizeWeb extends WebPlugin implements AdjustResizePlugin {
  constructor() {
    super({
      name: 'AdjustResize',
      platforms: ['web'],
    });
  }

  register(): Promise<void> {
    throw new Error('Method not implemented.');
  }
}
