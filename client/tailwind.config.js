/** @type {import('tailwindcss').Config} */
module.exports = {
  content: [
    "./src/**/*.{html,ts}",
  ],
  theme: {
    extend: {
      colors: {
        primary : {
          900:"#FDA22D",
          800:"#FD9011"
        },
        secondary: {
          100: "#FFF9F1",
          200: "#FBEDD9",
          300: "#F9E5EA",
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
