const path = require("path");
const webpack = require("webpack");

module.exports = {
  entry: "./src/main/webapp/js/index.js",
  mode: "development",
  module: {
    rules: [
      {
        test: /\.(js|jsx)$/,
        exclude: /(node_modules|bower_components)/,
        loader: 'babel-loader',
        options: { presets: ['env'] }
      },
      {
        test: /\.css$/,
        use: [ 'style-loader', 'css-loader' ]
      }
    ]
  },
  resolve: { extensions: ['*', '.js', '.jsx'] },
  output: {
    path: path.resolve(__dirname, "target/js/"),
    publicPath: "/target/js/",
    filename: "bundle.js"
  },
  devServer: {
    contentBase: path.join(__dirname, "src/main/webapp/public/"),
    port: 3000,
    publicPath: "http://localhost:3000/js/",
    hotOnly: true
  },
  plugins: [ new webpack.HotModuleReplacementPlugin() ]
};
