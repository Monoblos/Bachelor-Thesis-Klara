public static enum FilterType {
	BLACKLIST,
	WHITELIST,
	ALL,
	NOTHING
}

public TransformingClassLoader(
	boolean cache, 
	FilterType filterType, 
	Map<Pattern, LineSpecification> filter, 
	List<Class<? extends TransformationEventListener>>
			transformers, 
	LineSpecification defaultLineSpec)