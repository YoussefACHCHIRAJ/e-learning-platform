/** @type {import('tailwindcss').Config} */
module.exports = {
  content: [
    "./src/**/*.{html,ts}",
  ],
  theme: {
    extend: {
      colors: {
        primary : "#FF8B00",
        secondary: "#FFFFFF",
        accent1: "#252641"
      },
      fontFamily: {
        poppins: ['Poppins', 'sans']
      }
    },
  },
  plugins: [],
}
