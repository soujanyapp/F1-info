---
name: Grand Prix Editorial
colors:
  surface: '#fdf8f6'
  surface-dim: '#ddd9d7'
  surface-bright: '#fdf8f6'
  surface-container-lowest: '#ffffff'
  surface-container-low: '#f7f3f0'
  surface-container: '#f2edeb'
  surface-container-high: '#ece7e5'
  surface-container-highest: '#e6e2df'
  on-surface: '#1c1b1a'
  on-surface-variant: '#5d3f3c'
  inverse-surface: '#31302f'
  inverse-on-surface: '#f4f0ee'
  outline: '#926f6b'
  outline-variant: '#e6bdb8'
  surface-tint: '#c00014'
  primary: '#ae0011'
  on-primary: '#ffffff'
  primary-container: '#d71920'
  on-primary-container: '#ffece9'
  inverse-primary: '#ffb4ab'
  secondary: '#765a26'
  on-secondary: '#ffffff'
  secondary-container: '#fed797'
  on-secondary-container: '#795c28'
  tertiary: '#58554c'
  on-tertiary: '#ffffff'
  tertiary-container: '#716d63'
  on-tertiary-container: '#f6f0e3'
  error: '#ba1a1a'
  on-error: '#ffffff'
  error-container: '#ffdad6'
  on-error-container: '#93000a'
  primary-fixed: '#ffdad6'
  primary-fixed-dim: '#ffb4ab'
  on-primary-fixed: '#410002'
  on-primary-fixed-variant: '#93000d'
  secondary-fixed: '#ffdeaa'
  secondary-fixed-dim: '#e6c183'
  on-secondary-fixed: '#271900'
  on-secondary-fixed-variant: '#5c4210'
  tertiary-fixed: '#e8e2d6'
  tertiary-fixed-dim: '#cbc6ba'
  on-tertiary-fixed: '#1e1c14'
  on-tertiary-fixed-variant: '#4a473e'
  background: '#fdf8f6'
  on-background: '#1c1b1a'
  surface-variant: '#e6e2df'
typography:
  display-hero:
    fontFamily: Anybody
    fontSize: 84px
    fontWeight: '800'
    lineHeight: 90%
    letterSpacing: -0.04em
  headline-lg:
    fontFamily: Anybody
    fontSize: 48px
    fontWeight: '700'
    lineHeight: 110%
    letterSpacing: -0.02em
  headline-lg-mobile:
    fontFamily: Anybody
    fontSize: 32px
    fontWeight: '700'
    lineHeight: 110%
  headline-md:
    fontFamily: Anybody
    fontSize: 24px
    fontWeight: '600'
    lineHeight: 120%
  body-lg:
    fontFamily: Hanken Grotesk
    fontSize: 18px
    fontWeight: '400'
    lineHeight: 160%
  body-md:
    fontFamily: Hanken Grotesk
    fontSize: 16px
    fontWeight: '400'
    lineHeight: 150%
  label-caps:
    fontFamily: JetBrains Mono
    fontSize: 12px
    fontWeight: '500'
    lineHeight: 100%
    letterSpacing: 0.1em
rounded:
  sm: 0.125rem
  DEFAULT: 0.25rem
  md: 0.375rem
  lg: 0.5rem
  xl: 0.75rem
  full: 9999px
spacing:
  unit: 8px
  container-max: 1440px
  gutter: 24px
  margin-desktop: 64px
  margin-mobile: 20px
  section-gap: 120px
---

## Brand & Style

This design system embodies "Warm Performance"—a sophisticated fusion of high-octane energy and luxury editorial refinement. It moves away from the cold, clinical feel of traditional tech interfaces toward an "awards-level" aesthetic characterized by archival warmth and cinematic scale.

The design style is **Minimalist-Luxury**. It prioritizes high-quality typography, intentional whitespace, and a physical, paper-like tactile quality. By pairing the aggressive, variable nature of the typography with a soft, cream-based palette, the UI evokes the feeling of a premium heritage magazine covering modern high-performance subjects. The emotional response is one of prestige, urgency, and timelessness.

## Colors

The palette is anchored by a warm off-white base (`#F9F7F2`), which provides a sophisticated, low-strain canvas compared to stark white. 

*   **Signature Racing Red:** Used sparingly for high-impact calls to action, critical highlights, and brand markers.
*   **Soft Champagne & Copper:** These muted metallics are used for secondary accents, dividers, and subtle interactive states, adding a layer of "awards-grade" refinement.
*   **Warm Grays:** Used for secondary text and borders to maintain a soft contrast that feels intentional and premium.
*   **Deep Ink:** The neutral black is softened with a hint of warmth to ensure it harmonizes with the cream background rather than vibrating against it.

## Typography

The typography system relies on the tension between the expressive, variable widths of **Anybody** and the clean, architectural precision of **Hanken Grotesk**.

*   **Anybody** is the voice of the brand. Use it for large display titles and headlines. In high-prestige contexts, use the wider widths to occupy horizontal space and create an "editorial" feel.
*   **Hanken Grotesk** handles the narrative. Its contemporary construction ensures readability in long-form content while feeling more "refined" than standard system fonts.
*   **JetBrains Mono** is introduced for technical labels, data points, and captions, providing a "precision-engineered" contrast to the fluid display type.

## Layout & Spacing

The layout philosophy follows a **fixed-column grid with generous internal margins**. To achieve an "awards-level" feel, the design utilizes significant vertical breathing room (Section Gaps) to separate distinct content ideas.

*   **Desktop:** A 12-column grid with a maximum width of 1440px. Align key content to the central 8 columns for an editorial look, leaving wide margins for secondary navigation or decorative elements.
*   **Mobile:** A 4-column grid. Margins are reduced to 20px, but vertical spacing between elements remains aggressive to maintain the premium feel.
*   **Rhythm:** All spacing must be a multiple of 8px. Use larger increments (80px, 120px, 160px) for section transitions to signal a change in narrative.

## Elevation & Depth

This system avoids heavy shadows in favor of **Tonal Layering** and **Micro-Borders**.

*   **Tonal Layering:** Depth is created by placing elements on a slightly lighter or darker version of the cream base. A "Surface" card might be `#FFFFFF` (Pure White) sitting on the `#F9F7F2` (Cream) background.
*   **Micro-Borders:** Use 1px solid borders in `#E8E2D6` (Champagne) to define containers. This provides structure without the "weight" of a shadow.
*   **Interactive Depth:** Only use shadows on "Active" or "Floating" elements (like modals). These shadows should be extremely diffused, using a warm tint (`rgba(40, 30, 20, 0.08)`) rather than pure black to maintain the warmth of the palette.

## Shapes

The shape language is **Soft (0.25rem)**. This provides just enough rounding to feel modern and accessible without losing the structural, "printed" feel of a high-end magazine.

*   **Buttons & Inputs:** Use the standard `rounded` (4px) setting.
*   **Featured Cards:** May use `rounded-lg` (8px) for a slightly softer, more "contained" look.
*   **Avatars & Tags:** Should remain strictly rectangular or minimally rounded to stay consistent with the aggressive typography.

## Components

*   **Buttons:** Primary buttons use a solid Racing Red background with white text. Secondary buttons use a Champagne border with the Copper accent color for text. All buttons should have a subtle 200ms transition on hover.
*   **Input Fields:** Ghost-style inputs with a bottom-only border in Champagne. Focus state shifts the border to Racing Red and adds a very faint warm glow.
*   **Cards:** No shadows. Use a subtle fill color (`#F0EEE9`) and a 1px Champagne border. Titles within cards should use `headline-md` from the typography scale.
*   **Chips/Tags:** Use the `label-caps` typography. Backgrounds should be a very light Copper tint with Copper text.
*   **Dividers:** Should be thin (1px) and use a gradient that fades out toward the edges, utilizing the Champagne color to keep the transition soft.
*   **Lists:** High-contrast list items with generous padding (24px vertical) and a thin divider between them. Use `JetBrains Mono` for index numbers (e.g., 01, 02, 03).