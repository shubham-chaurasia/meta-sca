# Configuration for gcc

## Supported environments/languages

* C
* C++

## Configuration

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLACKLIST_gcc | Blacklist filter for this tool | space-separated-list | ""
| SCA_GCC_EXTRA_FATAL | Extra error-IDs leading to build termination when found | space-separated-list | ""
| SCA_GCC_EXTRA_SUPPRESS | Extra error-IDs to be suppressed | space-separated-list | ""
| SCA_GCC_HARDENING | Additional hardening checks | int: "0" or "1" | "1"

## Supports

* [x] suppression of IDs
* [x] terminate build on fatal
* [x] run on recipe
* [ ] run on image
* [x] run with SCA-layer default settings (see SCA_AVAILABLE_MODULES)

## Requires

* [ ] requires online access

## Known error-IDs

__tbd__

## Checking scope

* [ ] security
* [x] functional defects
* [ ] compliance
* [ ] style issues

## Statistics

* ⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛ 10/10 Build Speed
* ⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛ 10/10 Execution Speed
* ⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛ 10/10 Quality

## Score mapping

### Error considered as security relevant

* n.a.

### Error considered as functional defect

* gcc.gcc.*

### Error consired as compliance issue

* n.a.

### Error considered as style issue

* n.a.
