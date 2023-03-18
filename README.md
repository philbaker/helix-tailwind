# helix-tailwind

A starting point with [Helix](https://github.com/lilactown/helix) and Tailwind based on [reagent-tailwind](https://github.com/philbaker/reagent-tailwind)

## Setup

### Install dependencies
`npm install`

### Watch (dev)
- Shadow: `npm run shadow:watch`
- Tailwind: `npm run tailwind:watch`

### Release (prod)
- Shadow: `npm run shadow:release`
- Tailwind: `npm run tailwind:release`

### Tailwind intellisense support

```
 "tailwindCSS.experimental.classRegex": [                                                       
    ":class\\s+\"([^\"]*)\"",                                                                    
    ":[\\w-.#>]+\\.([\\w-]*)"                                                                    
  ],                                                                                             
  "tailwindCSS.includeLanguages": {                                                              
    "clojure": "html"                                                                            
  }   
```
