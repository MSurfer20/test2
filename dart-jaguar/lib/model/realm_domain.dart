import 'package:jaguar_serializer/jaguar_serializer.dart';


part 'realm_domain.jser.dart';

class RealmDomain {
   /* The new allowed domain.  */
  @Alias('domain', isNullable: false,  )
  final String domain;
   /* Whether subdomains are allowed for this domain.  */
  @Alias('allow_subdomains', isNullable: false,  )
  final bool allowSubdomains;
  

  RealmDomain(
      

{
     this.domain = null,  
     this.allowSubdomains = null 
    
    }
  );

  @override
  String toString() {
    return 'RealmDomain[domain=$domain, allowSubdomains=$allowSubdomains, ]';
  }
}

@GenSerializer(nullableFields: true)
class RealmDomainSerializer extends Serializer<RealmDomain> with _$RealmDomainSerializer {

}

