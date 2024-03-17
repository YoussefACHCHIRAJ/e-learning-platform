/** @type {import('tailwindcss').Config} */
module.exports = {
  content: [
    "./src/**/*.{html,ts}",
  ],
  theme: {
    extend: {
      colors: {
        primary : {
          900:"#328AA0",
          800:"#B2B7B1",
          700: "#68a3bc"
        },
        secondary: {
          100: "#FFF9F1",
          200: "#FFEBC6",
          300: "#F5D3C0",
        },
        third: {
          100: "#FA5155",
          200: "#F9E5EA",
        },
        accent: {
          100: "#F8F8FF",
          200: "#E7E6FB",
          300: "#9A93CA",
        },

      },
      fontFamily: {
        lato: ['Lato', 'sans']
      },
      fontSize: {
        h1: "2.333rem",
        h2: "1.667rem",
        p: "1.5rem",
      },
      gridTemplateRows: {
        layout: '5em minmax(88vh, 1fr)'
      }
      
    },
  },
  plugins: [],
}
